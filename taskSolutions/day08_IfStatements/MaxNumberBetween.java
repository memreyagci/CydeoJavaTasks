package day08_IfStatements;

import java.util.Scanner;

public class MaxNumberBetween {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        if (n1 == n2) {
            System.out.println("Equal");
        }
        else if (n1 > n2) {
            System.out.println(n1 + " is the maximum number.");
        }
        else {
            System.out.println(n2 + " is the maximum number.");
        }
    }
}

/*
	3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				200 is maximum number
 */
