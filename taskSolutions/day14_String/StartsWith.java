package day14_String;

import java.util.Scanner;

public class StartsWith {
    public static void main(String[] args) {
        System.out.println("Please enter a word:");
        String word = new Scanner(System.in).nextLine();

        if (word.startsWith("x")) {
            System.out.println(word.substring(1));
        }
    }
}

/*
    3. Ask user to enter a word. If the word starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */