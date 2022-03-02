package day19_Loops_String;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("How much you make an hour?:");
            double hourlyRate = scan.nextDouble();

            if (hourlyRate < 0) {
                System.err.println("Invalid Entry for Hourly Rate");
            }

            System.out.println("How many hours do you work per week?");
            int weeklyHour = scan.nextInt();

            if (weeklyHour < 1 || weeklyHour > 144) {
                System.err.println("Invalid Entry for Weekly Hours");
            }

            System.out.println("Enter your tax rate:");
            double taxRate = scan.nextDouble();

            if (taxRate < 0 || taxRate > 10) {
                System.err.println("Invalid Entry for state tax Rate");
            }

            double grossSalary = hourlyRate * weeklyHour;
            double federalTax = grossSalary * 26 / 100;
            double stateTax = grossSalary * taxRate / 100;
            double totalTax = federalTax + stateTax;
            double netIncome = grossSalary - totalTax;

            System.out.printf(
                    "Gross Salary: %.2f\n" +
                            "Federal Tax: %.2f\n" +
                            "State Tax: %.2f\n" +
                            "Total Tax: %.2f\n" +
                            "Net Income: %.2f\n\n", grossSalary, federalTax, stateTax, totalTax, netIncome);

            System.out.println("Would you like to continue?");
            String answer = scan.next();

            while (true) {
                if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) {
                    break;
                } else {
                    System.err.println("Please enter a valid answer:");
                    System.exit(0);
                }
            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }
        }

    }
}

/*
5. Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the program after displaying the error message "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144, terminate the program after displaying the error message "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate the program after displaying the error message "Invalid Entry for state tax Rate"


			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"
 */