//Snippet 21:
public class Main20 {
 public static void main(String[] args) {
 System.out.println("Hello, World!");
 // Missing closing brace here
}
/*
 What does the compiler say about mismatched braces?
-error: expected '}' at end of file
-every class and method must have an opening { and closing } brace to define its scope. The missing closing brace means that the main method is never properly closed, and as a result, the Java compiler is unable to determine where the main method and the class definition end.
------------------------------------------------------
public class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World!");
}
}
*/
