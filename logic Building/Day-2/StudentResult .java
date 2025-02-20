/*Write a program that determines whether a student passes or fails based on their grades in three
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or
more subjects, print the number of subjects they failed in.*/

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter marks for Subject 1: ");
        int subject1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int subject2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int subject3 = sc.nextInt();

        // Count the number of failed subjects
        int failedSubjects = 0;

        if (subject1 < 40) {
            failedSubjects++;
        }
        if (subject2 < 40) {
            failedSubjects++;
        }
        if (subject3 < 40) {
            failedSubjects++;
        }

        // Determine pass or fail using a switch statement
        switch (failedSubjects) {
            case 0:
                System.out.println("Congratulations! You have passed all subjects.");
                break;
            default:
                System.out.println("You have failed in " + failedSubjects + " subject(s).");
                break;
        }

        sc.close();
    }
}
