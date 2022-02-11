package day13_String;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        System.out.println("Please enter a three-letter word:");
        String word = new Scanner(System.in).nextLine();
        int len = word.length();

        if (len == 3 && word.charAt(1) == 'a') {
            System.out.println("Cool word");
        } else if (len < 3) {
            System.out.println("Word is too short");
        } else if (len > 3) {
            System.out.println("Word is too short");
        }
    }
}

/*
6. write a program that asks the user enter a three letter word. Check if the middle character of the given word is 'a'. In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
 */