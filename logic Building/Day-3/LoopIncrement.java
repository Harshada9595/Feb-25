public class LoopIncrement {
 public static void main(String[] args) {
 int count = 0;
 for (int i = 0; i < 4; i++) {
 count += i++ - ++i;
 }
 System.out.println(count);
 }
}
// Guess the output of this code snippet. 
Iteration 1 (i = 0)
i++ → Post-increment i (returns 0, then i becomes 1).
++i → Pre-increment i (increases i from 1 to 2, returns 2).
count += 0 - 2 → count = 0 - 2 = -2.
i = 2 after this iteration (because of post-increments).

Iteration 2 (i = 2)
i++ → Post-increment i (returns 2, then i becomes 3).
++i → Pre-increment i (increases i from 3 to 4, returns 4).
count += 2 - 4 → count = -2 + (-2) = -4.
i = 4 after this iteration.

Loop Ends
Since i = 4, the condition i < 4 fails, and the loop terminates.

Final Output:
diff

-4