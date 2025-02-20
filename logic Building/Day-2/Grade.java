/*Write a program to classify student grades based on the following criteria:
 If the score is greater than or equal to 90, print "A"
 If the score is between 80 and 89, print "B"
 If the score is between 70 and 79, print "C"
 If the score is between 60 and 69, print "D"
 If the score is less than 60, print "F" 
*/

public class Grade {
    public static void main(String[] args) {

        int score = 85;
        int g = score / 10; 

        switch (g) {
            case 10:  
                System.out.println("A");
                break;
            case 9:   
                System.out.println("B");
                break;
            case 8:   
                System.out.println("C");
                break;
            case 7:  
                System.out.println("D");
                break;
            default:  
                System.out.println("F");
        }
    }
}
