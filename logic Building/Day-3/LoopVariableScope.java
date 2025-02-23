public class LoopVariableScope {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++) {
 int x = i * 2;
 }
 System.out.println(x); // Error: 'x' is not accessible here
 }
}
/*
// Error to investigate: Why does the variable 'x' cause a compilation error? How does scope
--------------------------------------------------------
-Scope of x: The variable x is declared inside the for loop.
Variables declared inside a block ({}) are only accessible within that block.
Once the loop ends, x is out of scope, and the statement System.out.println(x); causes a compilation error (cannot find symbol x).
----------------------------------------------------------
public class LoopVariableScope {
 public static void main(String[] args) {
int x=1;
 for (int i = 0; i < 5; i++) {
 int x = i * 2;
 }
 System.out.println(x); // Error: 'x' is not accessible here
 }
}
*/