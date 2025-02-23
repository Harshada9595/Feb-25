public class IncorrectLoopUpdate {
 public static void main(String[] args) {
 int i = 0;
 while (i < 5) {
 System.out.println(i);
 i += 2; // Error: This may cause unexpected results in output
 }
 }
}
/*
// Error to investigate: What will be the output of this loop? How should the loop variable be updated to achieve the
desired result? 
-------------------------------------------------
The given loop does not run infinitely but skips odd numbers due to i += 2.
To print all numbers from 0 to 4, use i++ instead of i += 2.
 If even numbers were intended, the original loop is correct.
----------------------------------------------------
public class IncorrectLoopUpdate {
 public static void main(String[] args) {
 int i = 0;
 while (i < 5) {
 System.out.println(i);
 i ++; // Error: This may cause unexpected results in output
 }
 }
}
*/
