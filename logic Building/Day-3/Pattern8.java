
/*21. Write a program to print the following pattern:
1
1*3
1*3*5
1*3*5*7
1*3*5*7*9*/
public class Pattern8 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        
        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                if (j < i) {
                    System.out.print("*");
                }
                num += 2;
            }
            System.out.println(); // Move to the next line
        }
    }
}
