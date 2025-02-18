Snippet 25:
public class Switch 24{
 public static void main(String[] args) {
 int score = 85;
 switch(score) {
 case 100:
 System.out.println("Perfect score!");
 break;
 case 85:
 System.out.println("Great job!");
 break;
 default:
 System.out.println("Keep trying!");
 }
 }
}
/*
 Error to Investigate: Why does this code not compile? What does the error tell you about the
types allowed in switch expressions? How can you modify the code to make it work? 
-error: switch expressions must be of type byte, short, char, int, or an enumerated type
        switch(score) {
        ^

*/