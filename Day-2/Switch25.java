Snippet 26:
public class Switch25 {
 public static void main(String[] args) {
 int number = 5;
 switch(number) {
 /*case 5:
 System.out.println("Number is 5");
 break;
*/
 case 5:
 System.out.println("This is another case 5");
 break;
 default:
 System.out.println("This is the default case");
 }
 }
}
/* Error to Investigate: Why does the compiler complain about duplicate case labels? What
happens when you have two identical case labels in the same switch block? 
-------------------------------------------------------
-case labels must be unique. Each case value within the same switch block must be distinct. When you have two case 5: labels, the Java compiler cannot determine which block of code to execute when the value is 5, because both case labels match the same value.
-The Java compiler will throw an error, as it cannot have two distinct behaviors for the same input.
*/