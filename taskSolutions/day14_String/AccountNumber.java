package day14_String;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        System.out.println("Please enter an account number:");
        String accountNumber = new Scanner(System.in).nextLine();

        char firstCharacter = accountNumber.charAt(0);
        int lenOfAccountNum = accountNumber.length();

        if ((firstCharacter == '2' && lenOfAccountNum == 7) || (firstCharacter == '5' && lenOfAccountNum == 10)) {
            System.out.println("Invalid account number");
        }
    }
}

/*
    6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”
 */