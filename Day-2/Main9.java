//Snippet 10:
public class Main9 {
 public void display() {
 System.out.println("No parameters");
 }
 public void display(int num) {
 System.out.println("With parameter: " + num);
 }
 public static void main(String[] args) {
 display();
 display(5);
 }
}
/*
 What happens when you compile and run this code? Is method overloading allowed?
-yes 
-bz it has same same but different in parameter.
*/