public class IncorrectWhileLoopControl {
 public static void main(String[] args) {
 int num = 10;
 while (num = 10) {
 System.out.println(num);
 num--;
 }
 }
}
/*
// Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition? 
-------------------------------------------------------
-The condition while (num = 10) is incorrect because = is an assignment operator, not a comparison operator. the condition inside while must be a boolean expression (i.e., true or false).
num = 10 assigns 10 to num but does not return a boolean value
-----------------------------------------------------------public static void main(String[] args) {
 int num = 10;
 while (num == 10) {
 System.out.println(num);
 num--;
 }
 }
}
*/