public class Pattern6 {
    public static void main(String[] args) {
        int n = 4; // Half the height of the pattern
        
        // Upper part of the diamond
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
        
        // Lower part of the diamond
        for (int i = n - 2; i >= 0; i--) {
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
