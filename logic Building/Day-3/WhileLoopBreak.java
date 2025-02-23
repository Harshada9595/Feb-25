public class WhileLoopBreak {
 public static void main(String[] args) {
 int count = 0;
 while (count < 5) {
 System.out.print(count + " ");
 count++;
 if (count == 3) break;
 }
 System.out.println(count);
 }
}
// Guess the output of this while loop. 

Iteration	count Before	System.out.print(count + " ")	count++	if (count == 3) break	count After
1st	0	0	1	                                                                                    No	                          1
2nd	1	1	2	                                                                                    No	                          2
3rd	2	2	3	                                                                         Yes (breaks loop)	3
Output:
Copy
Edit
0 1 2 3



