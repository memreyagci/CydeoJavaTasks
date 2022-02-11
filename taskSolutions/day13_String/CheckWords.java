package day13_String;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word");
        String word1 = scan.next();

        System.out.println("Please enter a second word");
        String word2 = scan.next();

        System.out.println("Please enter a third word");
        String word3 = scan.next();

        int len1 = word1.length(),
                len2 = word2.length(),
                len3 = word3.length();

        if (len1 == len2 && len1 == len3) {
            System.out.println("All words are same length");
        } else if ((len1 == len2 && len1 != len3) || (len1 == len3 && len1 != len2)) {
            System.out.println("Not Same nor Different lenghts");
        } else {
            System.out.println("All different length");
        }
    }
}

/*
7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */