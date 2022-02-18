package day16_ForLoop_String;

import java.util.Scanner;

public class FrequencyOfWord {
    public static void main(String[] args) {
        System.out.println("Please enter a sentence:");
        String sentence = new Scanner(System.in).nextLine();

        String word;
        int numOfJava = 0;

        for (int i = 0; i < sentence.length() - 3; i++) {
            word = "" + sentence.charAt(i) + sentence.charAt(i + 1) + sentence.charAt(i + 2) + sentence.charAt(i + 3);

            word = sentence.substring(i, i+4);
            if (word.equals("Java")) {
                numOfJava++;
            }
        }

        System.out.println(numOfJava);
    }
}

/*
4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create
 */