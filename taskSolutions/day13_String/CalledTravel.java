package day13_String;

import java.util.Scanner;

public class CalledTravel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you have a valid passport?:");
        String havePassport = scan.next();
        scan.nextLine();

        if (havePassport.equals("yes")) {
            int costAmount = 1000;

            System.out.println("Which coun" + "try do you travel to?:");
            String countryName = scan.nextLine();

            System.out.println("How many bags will you take with you?:");
            byte numberOfBags = scan.nextByte();

            costAmount += numberOfBags * 50;

            System.out.println("How many people will you travel with?:");
            short peopleYouTravelWith = scan.nextShort();

            if (peopleYouTravelWith >= 3) {
                costAmount -= 300;
            } else {
                costAmount -= peopleYouTravelWith * 100;
            }

            System.out.println("Enter the name of the people they will travel with in one line, separating each name with a comma (String, multiple word):");
            String namesOfPeople = scan.next();

            System.out.println("Your ticket is booked to " + countryName + ". We have charged extra for the " + numberOfBags + " bags but you are traveling with " + peopleYouTravelWith + " so we are giving a discount. Your total cost is " + costAmount);
        } else if (havePassport.equals("no")) {
            int renewalCost = 200;

            System.out.println("When did your password expire (year): ");
            int yearOfExpire = scan.nextInt();

            int years = 2022- yearOfExpire;
            renewalCost += years * 75;

            System.out.println("Which country do you travel to?:");
            scan.nextLine();
            String countryName = scan.nextLine();

            System.out.println("Will you be traveling in the next year (yes or no)");
            String willTravel = scan.next();

            if (willTravel.equals("yes")) {
                renewalCost += 100;
            } else if (willTravel.equals("no")) {
                renewalCost -= 50;
            }

            System.out.println("Looks like your password has been expired for " + years + ", but not to worry we will get it ready for you to travel to " + countryName + ". Your total cost has come out to " + renewalCost + ".");
        }
    }
}

/*
3. Create a class calledTravel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line, separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName. We have charged extra for the $numberOfBags bags but you are traveling with $peopleYouTravelWith so we are giving a discount. Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years, but not to worry we will get it ready for you to travel to $allCountries. Your total cost has come out to $costAmount."
 */