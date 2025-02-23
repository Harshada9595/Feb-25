public class IncorrectWhileCondition {
 public static void main(String[] args) {
 int count = 5;
 while (count = 0) {
 System.out.println(count);
 count--;
 }
 }
}
/*
// Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the
`while` loop? 
---------------------------------------------------------

IncorrectWhileCondition.java:4: error: incompatible types: int cannot be converted to boolean
 while (count = 0) {
              ^
1 error
-while condition is false here. 
-initialise  count is 5, but  in while condition it become false.
---------------------------------------------------------

coorected code
------------------------------------------------------

public class IncorrectWhileCondition {
 public static void main(String[] args) {
 int count = 5;
 while (count = 5) {
 System.out.println(count);
 count--;
 }
 }
}
*/