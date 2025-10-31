using System.ComponentModel.DataAnnotations;
namespace Logistics.Dto
{
    public class TripCreationDto
    {
        [Required]
        public string Destination { get; set; }
        public int DriverId { get; set; } // Use the foreign key ID
        public int VehicleId { get; set; } // Use the foreign key ID
        public string Status { get; set; }
    }
}
