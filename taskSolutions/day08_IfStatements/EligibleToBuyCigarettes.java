package day08_IfStatements;

import java.util.Scanner;

public class EligibleToBuyCigarettes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        byte age = s.nextByte();

        if (age >= 18) {
            System.out.println("The person is eligible to buy cigarettes");
        }
        else {
            System.out.println("The person is NOT eligible to buy cigarettes");
        }
    }
}

/*
	1. Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes
 */