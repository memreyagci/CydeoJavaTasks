package day23_CustomMethod;

import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        String str = new Scanner(System.in).nextLine();

        printEachChar(str);
    }

    public static void printEachChar(String str) {
        for (char c : str.toCharArray()) {
            System.out.println(c);
        }
    }
}

/*
	13. create a method named printEachChar that can print each characters of a string
 */