package day14_String;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        System.out.println("Please enter your email address:");
        String email = new Scanner(System.in).next();

        String firstName = email.substring(0, email.indexOf('_'));
        String lastName = email.substring(email.indexOf('_') + 1, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@') + 1);

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

        System.out.printf("First name: %s\nLast name: %s\nDomain: %s", firstName, lastName, domain);
    }
}

/*
    8. Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
 */