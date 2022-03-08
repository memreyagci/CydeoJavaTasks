package day23_CustomMethod;

import java.util.Scanner;

public class DollarToLira {
    public static void main(String[] args) {
        System.out.println("How much dollar do you have?");
        double dollar = new Scanner(System.in).nextDouble();

        System.out.println("You have " + convertDollarToLira(dollar) + " liras.");
    }

    public static double convertDollarToLira (double dollar) {
        return 14.39 * dollar;
    }
}

/*
	10. create a method that can can convert dollar to lira
 */