package day15_ForLoops;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Please enter a string:");
        String str = new Scanner(System.in).nextLine().toLowerCase();

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equals(reversed)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

/*
	8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */