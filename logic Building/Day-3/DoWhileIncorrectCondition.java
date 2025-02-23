public class DoWhileIncorrectCondition {
 public static void main(String[] args) {
 int num = 0;
 do {
 System.out.println(num);
 num++;
 } while (num >0);
 }
}
/*
// Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `dowhile` loop? 
- do condition check only once.it is  print num value then increment to 1. condition is true   for all the  while ,goes infinity.
-executes only once is due to the incorrect condition in the while 
- if the loop is executing only once,while (num <0);
----------------------------------------------------
public class DoWhileIncorrectCondition {
 public static void main(String[] args) {
 int num = 0;
 do {
 System.out.println(num);
 num++;
 } while (num >5);
 }
}

*/