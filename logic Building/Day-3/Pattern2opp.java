/*14. Write a program to print the following pattern:
******
 *****
 ****
 ***
 **
 *   
 */
public class Pattern2opp{
public static void main(String[] args){
int n=6;
for(int i=0;i<6;i++){
for(int j=0;j<n-i;j++){
System.out.print(j);
}
System.out.println(" ");
}
}
}