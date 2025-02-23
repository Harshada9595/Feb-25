//factorial of 10
public class LamborginiFact{
public static void main(String[] args){
int fact=1;
int a=10;
for(int i=1; i<=10;i++){
fact=fact*a;
a--;
}
System.out.println("Factorial= "+fact);
}
}
