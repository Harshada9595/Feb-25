//find reverse number
import java.util.Scanner;
class Demo11{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter first number=");//123
int v=sc.nextInt();
int rev=0;
v=v%10;
rev=rev+v;
v=v/10;



System.out.println("\n The Reverse number of"+v+"=" +rev);}







}

}