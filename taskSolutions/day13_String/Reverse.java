package day13_String;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Please enter a string:");
        String str = new Scanner(System.in).nextLine();
        int len = str.length();

        if (len == 5) {
            System.out.println(String.valueOf(str.charAt(4)) + str.charAt(3) +str.charAt(2) +str.charAt(1) +str.charAt(0));
        } else if (len < 5) {
            System.out.println("Too short!");
        } else {
            System.out.println("Too long!");
        }
    }
}

/*
1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.
 */