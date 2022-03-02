package day19_Loops_String;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the side of the square:");
            double side = scan.nextDouble();

            if (side < 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }

            System.out.printf("Area: %.2f\nPerimeter: %.2f\n\n", (side*side), (4 * side));
            System.out.println("Would you like to calculate another square?");
            String answer = scan.next();

            while (true) {
                if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) {
                    break;
                } else {
                    System.err.println("Please enter a valid answer:");
                }
            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break;
            }
        }
    }
}

/*
2. Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */