public class  LamborginiSum{
public static void main(String[] args){
int no=9876;
int sum=0;
int temp=no;
while(temp>0){
temp%10;
temp/=10;
}
System.out.println(sum + "(9+8 +7+6)");
}