package day13_String;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)?:");
        String isSplit = scan.next();

        System.out.println("Enter the number of people:");
        int numOfPeople = scan.nextInt();

        System.out.println("Enter the check amount:");
        double amount = scan.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor):");
        String serviceQuality= scan.next();

        double tip = 0;

        if (serviceQuality.equals("Excellent")) {
            tip = amount / 100 * 25;
        } else if (serviceQuality.equals("Great")) {
            tip = amount / 100 * 20;
        } else if (serviceQuality.equals("Good")) {
            tip = amount / 100 * 15;
        } else if (serviceQuality.equals("Fair")) {
            tip = amount / 100 * 10;
        } else if (serviceQuality.equals("Poor")) {
            tip = amount / 100 * 5;
        }

        String bill = "Number of people entered: " + numOfPeople +
                "\nTotal to pay: " + (amount + tip) +
                "\nTotal tip: " + tip;

        if (isSplit.equals("Yes")) {
            bill += "\nTotal per person: " + ((amount + tip) / numOfPeople) +
                    "\nTip per person: " + (tip / numOfPeople);
        }

        System.out.println(bill);
        
    }
}

/*
2. Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output) Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the service quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method
 */