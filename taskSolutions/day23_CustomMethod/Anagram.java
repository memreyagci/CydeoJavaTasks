package day23_CustomMethod;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        anagram("silent", "listen");
    }

    public static void anagram(String str1, String str2) {
        char[] strArray1 = str1.toCharArray();
        char[] strArray2 = str2.toCharArray();
        Arrays.sort(strArray1);
        Arrays.sort(strArray2);

        if (Arrays.equals(strArray1, strArray2)) {
            System.out.printf("%s and %s are anagram", str1, str2);
        } else {
            System.out.printf("%s and %s are NOT anagram", str1, str2);
        }
    }
}

/*
    17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram
 */