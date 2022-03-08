package day23_CustomMethod;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle:");
        double radius = new Scanner(System.in).nextDouble();

        System.out.println("Area of the circle is: " + calculateCircleArea(radius));
    }

    public static double calculateCircleArea(double radius) {
        return 3.14 * radius * radius;
    }
}

/*
	6. create a method that can calculate the area of a circle
 */