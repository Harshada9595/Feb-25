public class WrongInitializationForLoop {
 public static void main(String[] args) {
 for (int i = 10; i >= 0; i++) {
 System.out.println(i);
 }
 }
}
/*
// Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the
initialization and update statements in the `for` loop? 
-for (int i = 10; i >= 0; i++) check for condition it goes in infinity loop to terminate make change in increment operator i.e decrement 'i'.
--------------------------------------------------
corrected code:
----------------------------------------------------
public class WrongInitializationForLoop {
 public static void main(String[] args) {
 for (int i = 10; i >= 0; i--) {
 System.out.println(i);
 }
 }
}
*/
