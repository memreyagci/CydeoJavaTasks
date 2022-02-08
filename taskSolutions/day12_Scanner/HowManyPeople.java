package day12_Scanner;

import java.util.Scanner;

public class HowManyPeople {
    public static void main(String[] args) {
        System.out.println("How many people do you live with?: ");
        int numOfPeople = new Scanner(System.in).nextInt();

        if (numOfPeople < 3) {
            System.out.println("Live with less than 3 people");
        } else if (numOfPeople >= 3 && numOfPeople <=6) {
            System.out.println("Live with 3 - 6 people");
        } else if (numOfPeople > 6) {
            System.out.println("Live with more than 6 people");
        }
    }
}

/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */
