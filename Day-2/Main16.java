//Snippet 17:
public class Main16 {
 public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = a ** b;
 System.out.println(result);
 }
}
/*
 What compilation error occurs? Why is the ** operator not valid in Java?
-error: operator ** cannot be applied to int, int
-The ** operator is not valid in Java for exponentiation (raising a number to the power of another). Java does not support exponentiation with the ** operator,
-----------------------------------------------------
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        double result = Math.pow(a, b);  // Use Math.pow() for exponentiation
        System.out.println(result);      // Output will be 100000.0
    }
}
*/