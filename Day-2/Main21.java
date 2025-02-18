//Snippet 22:
public class Main21 {
 public static void main(String[] args) {
 static void displayMessage() {
 System.out.println("Message");
 }
 }
}
/*
 What syntax error occurs? Can a method be declared inside another method?
-error: illegal start of type
        static void displayMessage() {  // Invalid static method declaration
               ^
-you cannot define a method inside another method. The main method is already a valid method, and Java does not allow you to define another method (such as displayMessage()) inside it.
------------------------------------------------------
public class Main21 {
static void displayMessage() {
 System.out.println("Message");
}
 public static void main(String[] args) {
 displayMessage();
 
 }
}
*/