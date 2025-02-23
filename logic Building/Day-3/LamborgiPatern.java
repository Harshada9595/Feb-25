public class  LamborgiPatern{
public static void main(String[] args){
int a=5;
int b=10;
for(int i=1;i<=a;i++){
printRow(i);
}
for(int i=a;i>=1;i--){
printRow(i);
}
}
public static void printRow(int a){
for(int j=1;j<=a;j++)
System.out.println(a);
if(j<a){
System.out.println("*");
}

}

System.out.println();
}
}
}