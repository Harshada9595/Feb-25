//reverse number 1234is 4321
public class LamborginiReverseno{
public static void main(String[] args){
int a=1234;
int rev=0;
while(a>0){
int remainder=a%10;
rev=rev*10+remainder;
a=a/10;
}
System.out.println("reverse number= "+rev);
}
}