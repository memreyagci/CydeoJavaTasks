package day16_ForLoop_String;

import java.util.Scanner;

public class FrequencyOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a string:");
        String str = scan.nextLine();
        System.out.println("Please enter a char:");
        char chr = scan.next().charAt(0);

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            if (chr == str.charAt(i)) {
                frequency++;
            }
        }

        System.out.println(frequency);
    }
}

/*
2. Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */