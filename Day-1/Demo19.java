//count  digit to the number
import java.util.Scanner;
class Demo19{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
 int count=0;

 System.out.print("Enter  number: ");
       int b = sc.nextInt();  
     for(;b!=0; b=b/10, ++count){
}
 System.out.println("The number has"+count+"digit");
   }     
}