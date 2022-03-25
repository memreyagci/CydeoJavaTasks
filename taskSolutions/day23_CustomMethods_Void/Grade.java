package day23_CustomMethods_Void;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        System.out.println("What is your score?");
        int score = new Scanner(System.in).nextInt();

        System.out.println("Your grade is: " + calculateGrade(score));
    }

    public static String calculateGrade(int score) {
        if (score >= 90) {
            return"A";
        } else if (score >= 80) {
            return"B";
        } else if (score >= 70) {
            return"C";
        } else if (score >= 60) {
            return"D";
        } else if (score >= 50) {
            return"E";
        } else if (score >= 40) {
            return"F";
        } else if (score >= 30) {
            return"G";
        } else if (score >= 20) {
            return"H";
        } else if (score >= 10) {
            return"I";
        } else if (score >= 0) {
            return"J";
        }
        return null;
    }
}

/*
	5. create a method that can calculate the grade of the student based on the score
 */