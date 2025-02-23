//fabonacii series 21
public class LamborginiFabo{
public static void main(String[] args){
int no1=0;
int no2=1;
System.out.println("Fabonacii series 1 to 21=" + no1);
System.out.println("Fabonacii series 1 to 21=" + no2);
for(int i=0;i<21;i++){
int fabo=no1+no2;
no1=no2;
no2=fabo;
System.out.println("Fabonacii series 1 to 21=" + fabo);
}


}
}