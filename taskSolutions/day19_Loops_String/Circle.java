package day19_Loops_String;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the radius of the circle:");
            double radius = scan.nextDouble();

            if (radius < 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }

            System.out.printf("Diameter: %.2f\nArea: %.2f\nPerimeter: %.2f\n\n", (2 * radius), (3.14 * radius * radius), (2 * 3.14 * radius));
            System.out.println("Would you like to calculate another circle?");
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
1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */