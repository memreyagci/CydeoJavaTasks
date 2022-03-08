package day23_CustomMethod;

import java.util.Scanner;

public class DollarToEuro {
    public static void main(String[] args) {
        System.out.println("How much dollar do you have?");
        double dollar = new Scanner(System.in).nextDouble();

        System.out.println("You have " + convertDollarToEuro(dollar) + " euros.");
    }

    public static double convertDollarToEuro (double dollar) {
        return 0.91 * dollar;
    }
}

/*
	9. create a method that can convert dollar to euro
 */