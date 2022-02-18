package day16_ForLoop_String;

import java.util.Scanner;

public class CatAndDog {
    public static void main(String[] args) {
        System.out.println("Please enter a sentence:");
        String sentence = new Scanner(System.in).nextLine();

        String word;
        int numOfCat = 0, numOfDog = 0;

        for (int i = 0; i < sentence.length() - 2; i++) {
            word = sentence.substring(i, i + 3);

            if (word.equalsIgnoreCase("cat")) {
                numOfCat++;
            } else if (word.equalsIgnoreCase("dog")) {
                numOfDog++;
            }
        }

        if (numOfCat == numOfDog) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

/*
5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */