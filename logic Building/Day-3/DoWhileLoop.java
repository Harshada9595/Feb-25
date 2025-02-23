public class DoWhileLoop {
 public static void main(String[] args) {
 int i = 1;
 do {
 System.out.print(i + " ");
 i++;
 } while (i < 5);
 System.out.println(i);
 }
}
// Guess the output of this do-while loop. 

Iteration-wise Execution:
Iteration	i Before	System.out.print(i + " ")	i++ (increment)	while (i < 5)	i After
1st	1	1	                                                                       2	Yes	2
2nd	2	2	                                                                        3	Yes	3
3rd	3	3	                                                                       4	Yes	4
4th	4	4	                                                                      5	No (loop exits)	5
Output:
Copy
Edit
1 2 3 4 5