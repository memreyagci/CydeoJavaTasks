package day23_CustomMethods_Void;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        System.out.println("Enter the side of the square:");
        double side = new Scanner(System.in).nextDouble();

        System.out.println("Area of the square is: " + calculateSquareArea(side));
    }

    public static double calculateSquareArea(double side) {
        return side * side;
    }
}

/*
	7. create a method that can calculate the area of a square
 */