
public class UninitializedWhileLoop {
 public static void main(String[] args) {
 int count;
 while (count < 10) {
 System.out.println(count);
 count++;
 }
 }
}
/*
// Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop
variable properly? 
---------------------------------------------------------
-The variable count is declared (int count;) but is not assigned any value before being used in while (count < 10).
-------------------------------------------------------
public class UninitializedWhileLoop {
 public static void main(String[] args) {
 int count=1;
 while (count < 10) {
 System.out.println(count);
 count++;
 }
 }
}
*/