public class DecrementingLoop {
 public static void main(String[] args) {
 int total = 0;
 for (int i = 5; i > 0; i--) {
 total += i;
 if (i == 3) continue;
 total -= 1;
 }
 System.out.println(total);
 }
}
// Guess the output of this loop.

Iteration	i Value	total += i	if (i == 3) continue	total -= 1	total after iteration
1st	5	total = 5	No	                          total = 4	4
2nd	4	total = 8	No	                          total = 7	7
3rd	3	total = 10	Yes (skips total -= 1)     N/A	10
4th	2	total = 12	No	                         total = 11	11
5th	1	total = 12	No	                         total = 11	11
Final Output:
Copy
Edit
11