import java.util.Scanner;
class Demo5{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("\nEnter first number=");
int fno=sc.nextInt();
System.out.println("\nEnter second number=");
int sno=sc.nextInt();
int c=fno+sno;
int a=fno-sno;
int b=fno*sno;
int d=fno / sno;
int e=fno % sno;

System.out.println("\n (125+24)="+c);
System.out.println("\n (125-24)="+a);
System.out.println("\n (125*24)="+b);
System.out.println("\n (125/24)="+d);
System.out.println("\n (125 mod  24)="+e);




}

}