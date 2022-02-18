package day15_ForLoops;

import java.util.Scanner;

public class FindType {
    public static void main(String[] args) {
        System.out.println("Please enter a string:");
        String str = new Scanner(System.in).next();

        String letters="", digits="", specialCharacters="";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar >= '0' && currentChar <= '9') {
                digits += currentChar;
            } else if ((currentChar >= 'a' && currentChar <= 'z') || (currentChar >= 'A' && currentChar <= 'Z')) {
                letters += currentChar;
            } else {
                specialCharacters += currentChar;
            }
        }

        System.out.printf("letters: %s\ndigits: %s\nspecial characters: %s", letters, digits, specialCharacters);
    }
}

/*
    5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */
