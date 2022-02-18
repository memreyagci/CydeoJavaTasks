package day15_ForLoops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");

        int num = new Scanner(System.in).nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}

/*
	3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */