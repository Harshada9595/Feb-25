public class MisplacedForLoopBody {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++)
 System.out.println(i);
 System.out.println("Done");
 }
}
/*
// Error to investigate: Why does "Done" print only once, outside the loop? How should the loop body be enclosed to
include all statements within the loop? 
--------------------------------------------------
-for loop only includes one statement (System.out.println(i);) because there are no curly braces {} enclosing multiple statements.

Thus, the loop runs five times, printing values from 0 to 4, and after the loop completes, "Done" prints only once because it's not part of the loop.
-------------------------------------------------------
public class MisplacedForLoopBody {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++){
 System.out.println(i);
 System.out.println("Done");
}
 }
}
*/
