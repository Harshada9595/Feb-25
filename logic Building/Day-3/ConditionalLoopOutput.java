public class ConditionalLoopOutput {
 public static void main(String[] args) {
 int num = 1;
 for (int i = 1; i <= 4; i++) {
 if (i % 2 == 0) {
 num += i;
 } else {
 num -= i;
 }
 }
 System.out.println(num);
 }
}
// Guess the output of this loop. 
Iteration-wise Execution:
Iteration	i Value	i % 2 == 0 (Even?)	Operation on num	num After
1st	1	No (Odd)                  	num = num - 1 = 1 - 1	                 0
2nd	2	Yes (Even) 	num = num + 2 = 0 + 2	                   2
3rd	3	No (Odd)     	num = num - 3 = 2 - 3	                  -1
4th	4	Yes (Even)	                         num = num + 4 = -1 + 4	3
Final Output:
Copy
Edit
3
