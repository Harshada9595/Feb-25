import java.util.Scanner;
public class Cal1{
public static void main(String[] args){
System.out.println("Enter the amount");
Scanner sc=new Scanner(System.in);
double a=sc.nextInt();
double dis=0;
int condition;
if(a>=10000)
{
condition=1;
}
if(a<10000 && a>=5000){
condition=2;
}
else{
condition=3;
}

switch(condition) {
case 1:
dis=a*0.20;
break;
case 2:
dis=a*0.10;
break;
case 3:
dis=a*0.05;

}
double amount =a-dis;

System.out.println("Discound :"+dis);
System.out.println("Final amount:"+amount);




}
}