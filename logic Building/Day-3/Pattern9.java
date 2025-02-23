/*22. Write a program to print the following pattern:
*********
 *******
 *****
 ***
 *
 ***
 *****
 *******
********* */
public class Pattern9 {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the upper half
        
        // Upper part of the pattern
        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        // Lower part of the pattern
        for (int i = 2; i <= n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
