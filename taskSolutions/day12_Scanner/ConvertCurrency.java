package day12_Scanner;

import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        System.out.println("Enter cents");

        int inCents = new Scanner(System.in).nextInt();
        int dollars = inCents / 100;
        int cents = inCents % 100;
        String result = inCents + " cents equal to: " + dollars + " dollars";

        if (cents == 0) {
            System.out.println(result);
        } else {
            System.out.println(result + " and " + cents + " cents");
        }
    }
}

/*
3. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */