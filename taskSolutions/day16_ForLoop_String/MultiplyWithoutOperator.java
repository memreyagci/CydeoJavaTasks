package day16_ForLoop_String;

import java.util.Scanner;

public class MultiplyWithoutOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int num1 = scan.nextInt();
        System.out.println("Please enter a second number:");
        int num2 = scan.nextInt();

        int total = 0;

        for(int i = 1; i <= num1; i++) {
            total += num2;
        }

        System.out.println(total);
    }
}

/*
3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200
 */