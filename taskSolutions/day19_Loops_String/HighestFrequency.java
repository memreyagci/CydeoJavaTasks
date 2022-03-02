package day19_Loops_String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HighestFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String str = scan.nextLine();

        int max = 0;
        int count;
        String highestFrequency = "";

        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int a = 0; a < str.length(); a++) {
                if (str.charAt(i) == str.charAt(a)) {
                    count++;
                }
            }
                if (count == max && highestFrequency.indexOf(str.charAt(i)) == -1) {
                    highestFrequency += " " + str.charAt(i);
                } else if (count > max) {
                    max = count;
                    highestFrequency = String.valueOf(str.charAt(i));
                }
        }

        System.out.println(highestFrequency);
    }
}

/*
6.  Write a program that can find the character that has the highest frequency from a string
 */