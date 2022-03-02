package day19_Loops_String;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter your score:");
            int score = scan.nextInt();

            if (score > 100 || score < 0) {
                System.err.println("Invalid Entry");
            }

            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 60) {
                System.out.println("D");
            } else if (score >= 50) {
                System.out.println("E");
            } else if (score >= 40) {
                System.out.println("F");
            } else if (score >= 30) {
                System.out.println("G");
            } else if (score >= 20) {
                System.out.println("H");
            } else if (score >= 10) {
                System.out.println("I");
            } else if (score >= 0) {
                System.out.println("J");
            }

            System.out.println("Would you like to calculate another circle?");
            String answer = scan.next();

            while (true) {
                if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) {
                    break;
                } else {
                    System.err.println("Please enter a valid answer:");
                }
            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                break;
            }
        }
    }
}

/*
4. Write a program for grade calculator:
			1. Ask the user "Enter your score"
				If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

			 2. Display the grade of the student.
			 		90 ~ 100 ==> A
			 		80 ~ 89 ==> B
			 		70 ~ 79 ==> C
			 		60 ~ 69 ==> D
			 		0 ~ 59 ==> F

			2. Ask the user would you like to continue
				If "yes" --> repeat the previous steps
				If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"
 */