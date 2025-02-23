//Largest digit
public class  LamborgiLargestdigit{
public static void main(String[] args){
int a=4825;
int max=0;

while(a>0){
int digit=a%10;
if(digit>max){
max=digit;
}

System.out.println(max);
}
}
}