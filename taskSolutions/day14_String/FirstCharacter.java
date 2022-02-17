package day14_String;

import java.util.Scanner;

public class FirstCharacter {
    public static void main(String[] args) {
        System.out.println("Please enter a word:");
        String word = new Scanner(System.in).nextLine();

        char firstChar = word.charAt(0);

        if (firstChar >= '0' && firstChar <= '9') {
            System.out.println("The first character is a digit.");
        } else if (firstChar >= 'a' && firstChar <= 'z') {
            System.out.println("The first character is a lowercase letter.");
        } else if (firstChar >= 'A' && firstChar <= 'Z') {
            System.out.println("The first character is a uppercase letter.");
        } else {
            System.out.println("The first character is a special character.");
        }
    }
}

/*
    5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table
 */