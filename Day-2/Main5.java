//Snippet 7:
public class Main {
 public static void main(String[] args) {
String x = "Hello";
 System.out.println(x);
 }
}
/*
 What compilation error do you see? Why does Java enforce type safety
-incompatible types.
-Java detects type mismatches at compile time, reducing the chances of runtime exceptions
- prevent runtime errors.
Memory Safety & Security
Java does not allow direct memory access
- operations are performed on compatible types, avoiding unpredictable behavior.
---------------------------------------------------
public class Main {
 public static void main(String[] args) {
 String x = "Hello";
 System.out.println(x);
 }
}
*/