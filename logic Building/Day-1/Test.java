class  Test{
public static void main(String[] args){
/*
int a=50;
System.out.println(a>>1);//5
System.out.println(a<<1);//20
*/
int a,b;
for( a=10,b=20; (a>=5 && b>=15); a--,b--)
{
System.out.println(a+" "+b);
}
System.out.println("outside loop" +a+","+b);


}
}