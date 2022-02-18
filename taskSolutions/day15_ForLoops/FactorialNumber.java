package day15_ForLoops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        int num = new Scanner(System.in).nextInt();

        int result = 1;

        for (int i = 2; i <= num; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}


/*
	4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */