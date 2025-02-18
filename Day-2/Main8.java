//Snippet 9:
public class Main8 {
 public static void main(String[] args) {
 int class = 10;
 System.out.println(class);
 }
}
/*
 What error occurs? Why can't reserved keywords be used as identifiers?
-class is keyword, it is not defines as variable.
-keywords are pre-defined in java.
-Keywords like class, int, for, if, static, etc., are part of Java’s syntax and structure. Using them as identifiers would make the code ambiguous.
-------------------------------------------------------
public class Main8 {
 public static void main(String[] args) {
 int c = 10;
 System.out.println(c);
 }
}
*/