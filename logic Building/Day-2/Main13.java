//Snippet 14:
public class Main13 {
 public static void main(String[] args) {
 double num = "Hello";
 System.out.println(num);
 }
}
/*
 What compilation error occurs? Why does Java enforce data type constraints?
-error: incompatible types: String cannot be converted to double
-to assign a String ("Hello") to a double variable (num). This is not allowed because String and double are two completely different types.
-------------------------------------------------------
public class Main13 {
 public static void main(String[] args) {
 String num = "Hello";
 System.out.println(num);
 }
}
*/