//Snippet 4:
public class Main3 {
 public static void main() {
 System.out.println("Hello, World!");
 }
}
/*
 What happens when you compile and run this code? Why is String[] args needed?
Error=Main method not found in class Main3, ------------------------------------------
define the main method as:
   public static void main(String[] args)
-bz it is already fix in java.
-ohterwise it not recognize main method .
-String[] args parameter must have in main method

--------------------------------------------------
public class Main3 {
 public static void main(String[] args) {
 System.out.println("Hello, World!");
 }
}

*/