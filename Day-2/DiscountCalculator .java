/*Write a program to calculate the discount based on the total purchase amount. Use the following
criteria:
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount.
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount.
 If the total purchase is less than Rs.500, apply a 5% discount. */
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the total purchase amount: Rs. ");
        double totalAmount = sc.nextDouble();
        double discount = 0;

        // Determine the discount using a switch case
        int category;
        if (totalAmount >= 1000) {
            category = 1;  // 20% discount
        } else if (totalAmount >= 500) {
            category = 2;  // 10% discount
        } else {
            category = 3;  // 5% discount
        }

        switch (category) {
            case 1:
                discount = totalAmount * 0.20;
                break;
            case 2:
                discount = totalAmount * 0.10;
                break;
            case 3:
                discount = totalAmount * 0.05;
                break;
        }

        double finalAmount = totalAmount - discount;

        // Display the results
        System.out.println("Discount Applied: Rs. " + discount);
        System.out.println("Final Amount to Pay: Rs. " + finalAmount);

        sc.close();
    }
}
