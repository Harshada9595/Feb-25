public class InfiniteForLoopUpdate {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i += 2) {
 System.out.println(i);
 }
 }
}
/*
// Error to investigate: Why does the loop print unexpected results or run infinitely? How should the loop update
expression be corrected? 
----------------------------------------------------------
-The loop does not run infinitely but prints only even numbers due to i += 2.
- The correct update expression depends on what numbers you want to print.
- If you need all numbers from 0 to 4, use i++ instead of i += 2.
----------------------------------------------------------
public class InfiniteForLoopUpdate {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i ++) {
 System.out.println(i);
 }
 }
}
*/
