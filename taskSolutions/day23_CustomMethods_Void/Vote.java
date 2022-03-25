package day23_CustomMethods_Void;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What your age?");
        int age = scanner.nextInt();
        System.out.println("What your age?");
        String country = scanner.nextLine();

        if (eligibleToVote(age, country)) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are NOT eligible to vote");
        }
    }

    public static boolean eligibleToVote(int age, String country) {
        return age >= 18 && country.equalsIgnoreCase("turkey");
    }
}

/*
	4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!
 */