/* Write a program that uses a nested switch statement to print out the day of the week based on an
integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it
is a weekday or weekend. */
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7) to get the day of the week: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                // Nested switch to handle weekdays
                switch (day) {
                    case 1:
                        System.out.println("Monday: Weekday");
                        break;
                    case 2:
                        System.out.println("Tuesday: Weekday");
                        break;
                    case 3:
                        System.out.println("Wednesday: Weekday");
                        break;
                    case 4:
                        System.out.println("Thursday: Weekday");
                        break;
                    case 5:
                        System.out.println("Friday: Weekday");
                        break;
                }
                break;
            case 6:
            case 7:
                // Nested switch to handle weekend
                switch (day) {
                    case 6:
                        System.out.println("Saturday: Weekend");
                        break;
                    case 7:
                        System.out.println("Sunday: Weekend");
                        break;
                }
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
}
