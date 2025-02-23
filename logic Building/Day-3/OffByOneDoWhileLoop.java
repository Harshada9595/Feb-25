public class OffByOneDoWhileLoop {
 public static void main(String[] args) {
 int num = 1;
 do {
 System.out.println(num);
 num--;
 } while (num > 0);
 }
} 

/*
// Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the
numbers from 1 to 5? 
-------------------------------------------------------
-(while (num > 0))
Now num = 0, so the condition fails.
The loop terminates after just one iteration.
-------------------------------------------------------
public class OffByOneDoWhileLoop {
 public static void main(String[] args) {
 int num = 1;
 do {
 System.out.println(num);
 num++;
 } while (num <= 4);
System.out.println(num);
num++;
 }
}
*/
