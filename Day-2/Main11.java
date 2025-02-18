//Snippet 12:
public class Main11 {
 public static void main(String[] args) {
 while (true) {
 System.out.println("Infinite Loop");
 }
 }
} 

/*
 What happens when you run this code? How can you avoid infinite loops?
-goes infinte loop
-make if condition.
-use termination condition.
-use another loop having termination condition.
-----------------------------------------------
public class Main {
 public static void main(String[] args) {
int count=0;
 while (true) {
if(count==1){

 System.out.println("Infinite Loop");
break;
}
count++;
 }
 }
*/