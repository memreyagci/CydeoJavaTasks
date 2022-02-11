package day13_String;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a string:");
        String string1 = scan.nextLine();
        System.out.println("Please enter a second one:");
        String string2 = scan.nextLine();

        System.out.println((string1.length() > string2.length()? string1: string2));
    }
}

/*
2. write a program that asks user to enter two strings, and print out the longest string
 */