package day13_String;

import java.util.Scanner;

public class IsStringEmpty {
    public static void main(String[] args) {
        System.out.println("Please enter a string:");
        String str = new Scanner(System.in).nextLine();

        int len = str.length();

        if (len == 0) {
            System.out.println("The string is empty.");
        } else if (len > 3) {
            System.out.println(String.valueOf(str.charAt(len - 3)) + str.charAt(len - 2) + str.charAt(len - 1));
        } else if (len <= 3) {
            System.out.println(str);
        }
    }
}

/*
5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */