package day12_Scanner;

import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        System.out.println("Enter miles:");
        double miles = new Scanner(System.in).nextDouble();

        System.out.printf(miles + " miles equal to %.2f kilometers", (miles * 1.609344));
    }
}

/*
4. Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
 */