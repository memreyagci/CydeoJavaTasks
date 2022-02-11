package day13_String;

import java.util.Scanner;

public class FirstAndLastCharacters {
    public static void main(String[] args) {
        System.out.println("Please enter a sentence:");

        String sentence = new Scanner(System.in).nextLine();

        System.out.println(sentence.charAt(0) + " " + sentence.charAt(sentence.length() - 1));
    }
}

/*
1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
 */