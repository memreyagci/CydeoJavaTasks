package day13_String;

import java.util.Scanner;

public class FirstAndLastCharacterCheck {
    public static void main(String[] args) {
        System.out.println("Please enter a string:");
        String str = new Scanner(System.in).nextLine();

        System.out.println((str.charAt(0) == str.charAt(str.length() - 1))? "same": "different");
    }
}

/*
3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */