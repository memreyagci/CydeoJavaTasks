package day23_CustomMethod;

import java.util.Scanner;

public class KgToLb {
    public static void main(String[] args) {
        System.out.println("Enter kg:");
        double kg = new Scanner(System.in).nextDouble();

        System.out.println("It equals to " + convertKgToLb(kg) + " lb.");
    }

    public static double convertKgToLb(double kg) {
        return kg * 2.2046226218;
    }
}

/*
	11. create a method that can convert kg to lb
 */