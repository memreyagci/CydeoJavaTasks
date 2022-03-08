package day23_CustomMethod;

import java.util.Scanner;

public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = new Scanner(System.in).nextInt();

        System.out.println("Your number is " + positiveNegativeOrZero(num));
    }

    public static String positiveNegativeOrZero(int num) {
        if (num > 0) {
            return "positive";
        } else if (num < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }
}

/*
	12. create a method that can if the given integer is positive, negative or zero
 */