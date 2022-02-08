package day10_NestedIf;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        char grade = new Scanner(System.in).next().charAt(0);

        if (grade >= 'A' && grade <= 'F' && grade != 'E') {
            if (grade == 'A') {
                System.out.println("excellent");
            } else if (grade == 'B') {
                System.out.println("great job");
            } else if (grade == 'C') {
                System.out.println("good");
            } else if (grade == 'D') {
                System.out.println("passed");
            } else if (grade == 'F') {
                System.out.println("Failed");
            }
        }
        else {
            System.out.println("Invalid grade.");
        }
    }
}

/*
3. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */