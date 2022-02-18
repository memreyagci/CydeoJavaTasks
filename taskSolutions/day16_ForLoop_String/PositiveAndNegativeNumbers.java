package day16_ForLoop_String;

import java.util.Scanner;

public class PositiveAndNegativeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfPositive = 0, numOfNegative = 0, num;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter number " + i);
            num = scan.nextInt();

            if (num > 0) {
                numOfPositive++;
            } else if (num < 0) {
                numOfNegative++;
            }
        }

        System.out.printf("%d positive and %d negative", numOfPositive, numOfNegative);
    }
}

/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */