/*
16. Write a program to print the following pattern:
        *
      ***
    *****
  *******
*********
*/
public class Pattern4 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            
            System.out.println(); // Move to the next line
        }
    }
}