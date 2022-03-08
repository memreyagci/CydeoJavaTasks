package day16_ForLoop_String;

import java.util.Scanner;

public class FrequencyOfWord {
    public static void main(String[] args) {
        System.out.println("Please enter a sentence:");
        String sentence = new Scanner(System.in).nextLine();

        String word;
        int numOfJava = 0;

        for (int i = 0; i < sentence.length() - 4; i++) {
            word = sentence.substring(i, i+4);
            if (word.equals("Java")) {
                if (i == 0) {
                    if (i+4 > sentence.length()) {
                        numOfJava++;
                    } else if (sentence.charAt(i+4) == ' ') {
                        numOfJava++;
                    }
                } else if (i+4 == sentence.length() - 1) {
                    numOfJava++;
                } else if (sentence.substring(i-1, i+5).equals(" Java ")) {
                    numOfJava++;
                }
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