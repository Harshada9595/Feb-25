public class NestedIncrement {
 public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = ++a * b-- - --a + b++;
 System.out.println(result);
 }
}
// Guess the output of this code snippet. 
result = ++a * b-- - --a + b++;
Step	Expression	Operation	New Value of Variable	Value Used in Expression
1	++a	Pre-increment a (10 → 11)	a = 11	11
2	b--	Post-decrement b (5 → 4)	b = 4	5
3	--a	Pre-decrement a (11 → 10)	a = 10	10
4	b++	Post-increment b (4 → 5)	b = 5	4
Substituting values into the expression:
makefile

result = (11 * 5) - (10) + (4)
       = (55) - (10) + (4)
       = 55 - 10 + 4
       = 49
Final Output:

49