//Snippet 2:
public class Main1 {
 static void main(String[] args) {
 System.out.println("Hello, World!");
 }
} 
/*
- Main method not found in class Main1, define the main method as:
   public static void main(String[] args)
-if method is not public then class is not recognize the method.
-mainmethod is always public beacuse it is called anywhere in program.

-----------------------------------------
corrected code
public class Main1 {
 public static void main(String[] args) {
 System.out.println("Hello, World!");
 }
} 
*/