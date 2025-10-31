using Logistics.Data;
using Logistics.Dto; // Import DTOs
using Logistics.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Logistics.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class TripsController : ControllerBase
    {
        private readonly LogisticsDbContext _context;

        public TripsController(LogisticsDbContext context)
        {
            _context = context;
        }

        // GET: api/Trips (Correct)
        [HttpGet]
        public async Task<ActionResult<IEnumerable<Trip>>> GetTrips()
        {
            // Might want to include related Driver/Vehicle entities here in a real app
            return await _context.Trips.ToListAsync();
        }

        // GET: api/Trips/5 (Correct)
        [HttpGet("{id}")]
        public async Task<ActionResult<Trip>> GetTrip(int id)
        {
            var trip = await _context.Trips.FindAsync(id);
            if (trip == null) return NotFound();
            return trip;
        }

        // PUT: api/Trips/5 (Uses full Trip model - fine if IDs match)
        [HttpPut("{id}")]
        public async Task<IActionResult> PutTrip(int id, Trip trip)
        {
            // Assumes frontend ID matches backend TripId format (e.g. both camelCase 'id')
            if (id != trip.TripId) return BadRequest();
            _context.Entry(trip).State = EntityState.Modified;

            try { await _context.SaveChangesAsync(); }
            catch (DbUpdateConcurrencyException)
            {
                if (!TripExists(id)) return NotFound();
                else throw;
            }
            return NoContent();
        }

        // POST: api/Trips (Updated to use DTO and manage availability)
        [HttpPost]
        public async Task<ActionResult<Trip>> PostTrip(TripCreationDto tripDto)
        {
            // Frontend sends driverId 0 if null is selected
            if (tripDto.DriverId == 0 || tripDto.VehicleId == 0)
            {
                return BadRequest("Driver and Vehicle IDs must be selected.");
            }

            var trip = new Trip
            {
                Destination = tripDto.Destination,
                DriverId = tripDto.DriverId,
                VehicleId = tripDto.VehicleId,
                Status = tripDto.Status ?? "Pending"
            };

            // Start a transaction to ensure both operations succeed or fail together
            using (var transaction = await _context.Database.BeginTransactionAsync())
            {
                try
                {
                    _context.Trips.Add(trip);
                    await _context.SaveChangesAsync();

                    // Update driver availability to false (unavailable)
                    var driver = await _context.Drivers.FindAsync(trip.DriverId);
                    if (driver != null) driver.IsAvailable = false;

                    // Update vehicle availability to false (unavailable)
                    var vehicle = await _context.Vehicles.FindAsync(trip.VehicleId);
                    if (vehicle != null) vehicle.IsAvailable = false;

                    await _context.SaveChangesAsync();
                    await transaction.CommitAsync();

                    return CreatedAtAction("GetTrip", new { id = trip.TripId }, trip);
                }
                catch (Exception ex)
                {
                    await transaction.RollbackAsync();
                    // Log the exception details for debugging
                    return StatusCode(500, "An error occurred while creating the trip and updating availability.");
                }
            }
        }

        // DELETE: api/Trips/5 (You need to handle availability here too for a real app)
        [HttpDelete("{id}")]
        public async Task<IActionResult> DeleteTrip(int id)
        {
            var trip = await _context.Trips.FindAsync(id);
            if (trip == null) return NotFound();

            _context.Trips.Remove(trip);
            await _context.SaveChangesAsync();

            return NoContent();
        }

        private bool TripExists(int id)
        {
            return _context.Trips.Any(e => e.TripId == id);
        }
    }
}
