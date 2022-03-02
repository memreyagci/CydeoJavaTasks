package day19_Loops_String;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the length of the rectangle:");
            double length = scan.nextDouble();

            System.out.println("Enter the width of the rectangle:");
            double width = scan.nextDouble();

            if (length < 0) {
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }

            System.out.printf("Area: %.2f\nPerimeter: %.2f\n\n", (length * width), (2 * (width + length)));
            System.out.println("Would you like to calculate another rectangle?");
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
3. Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

			2. Ask the user "Enter the width of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

			3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */