//Snippet 15:
public class Main14 {
 public static void main(String[] args) {
 int num1 = 10;
 double num2 = 5.5;
 int result = num1 + num2;
 System.out.println(result);
 }
}
/*
 What error occurs when compiling this code? How should you handle different data types
in operations?
-error: incompatible types: possible lossy conversion from double to int
- implicit type promotion rules to automatically promote smaller types to larger ones to avoid data loss:
---------------------------------------------------------
public class Main14 {
 public static void main(String[] args) {
 double num1 = 10;
 double num2 = 5.5;
 double result = num1 + num2;
 System.out.println(result);
 }
}
*/