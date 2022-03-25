package day24_CustomMethods_Returns;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("cba", "bac"));
    }

    public static boolean isAnagram(String str1, String str2) {
        char[] chr1 = str1.toCharArray();
        char[] chr2 = str2.toCharArray();

        Arrays.sort(chr1);
        Arrays.sort(chr2);

        return Arrays.equals(chr1, chr2);
    }
}

/*
    2. create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true
 */