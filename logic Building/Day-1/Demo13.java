//find factorial
import java.util.Scanner;
class Demo14{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int a=sc.nectInt();
System.out.println(a);
fact=1;
for(int i=1;i<a;i++){
fact=fact*a;
a--;
}

System.out.println ("Factorial of "+a+"="+fact);











}

}