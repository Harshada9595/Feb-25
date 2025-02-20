//Snippet 19:
public class Main 18{
 public static void main(String[] args) {
 int a = 10;
 int b = 0;
 int result = a / b;
 System.out.println(result);
 }
}
/*
 What runtime exception is thrown? Why does division by zero cause an issue in Java?
-a ArithmeticException with the message "/ by zero".
-There is no valid result for dividing any number by zero, so Java throws an exception to indicate this error.
--------------------------------------------------------
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        
        // Check if divisor is zero before performing division
        if (b != 0) {
            int result = a / b;
            System.out.println(result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
*/