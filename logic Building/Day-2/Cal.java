/*Write a program that acts as a simple calculator. It should accept two numbers and an operator
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested ifelse to check if division by zero is attempted and display an error message. 
*/
import java.util.Scanner;
public class Cal{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers: ");
int a=sc.nextInt();
int b=sc.nextInt();

System.out.println("Choose an operation: ");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");
        int op = sc.nextInt(); 

switch(op) {
case 1:
System.out.println("result= "+(a+b));
break;
case 2:
System.out.println("result= "+(a-b));
break;
case 3:
System.out.println("result= "+(a*b));
break;
case 4:
switch (b) {
                    case 0:
                        System.out.println("Error! Division by zero is not allowed.");
                        break;
                    default:
                        System.out.println("Result = " + (a / b));
                        break;
                }
                break;
            default:
                System.out.println("Invalid choice! Please enter a valid operation (1-4).");
        }
}

}
