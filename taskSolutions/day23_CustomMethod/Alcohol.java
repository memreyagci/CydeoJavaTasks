package day23_CustomMethod;

import java.util.Scanner;

public class Alcohol {
    public static void main(String[] args) {
        System.out.println("What your age?");
        int age = new Scanner(System.in).nextInt();

        if (isEligible(age)) {
            System.out.println("You are eligible to buy alcohol");
        } else {
            System.out.println("You are NOT eligible to buy alcohol");
        }
    }

    public static boolean isEligible(int age) {
        return age >= 18;
    }
}

/*
	3. create a method that can check if a person is eligible to buy alcohol
 */