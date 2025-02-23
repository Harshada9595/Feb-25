public class IncrementDecrement {
 public static void main(String[] args) {
 int x = 5;
 int y = ++x - x-- + --x + x++;
 System.out.println(y);
 }
}
// Guess the output of this code snippet. 
y = ++x - x-- + --x + x++;
Step	Expression	Operation	New Value of x	Value Used
1	++x	Pre-increment x (5 → 6)	x = 6	6
2	x--	Post-decrement x (6 → 5)	x = 5	6
3	--x	Pre-decrement x (5 → 4)	x = 4	4
4	x++	Post-increment x (4 → 5)	x = 5	4
Substituting values:
ini

y = (6) - (6) + (4) + (4)
y = 6 - 6 + 4 + 4
y = 8
Final Output:

8
