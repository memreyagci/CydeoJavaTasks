package day14_String;

import java.util.Scanner;

public class EndsWith {
    public static void main(String[] args) {
        System.out.println("Please enter a word:");
        String word = new Scanner(System.in).nextLine();

        if (word.endsWith("ly")) {
            System.out.println("really???");
        } else {
            System.out.println("never mind");
        }
    }
}

/*
    2. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */