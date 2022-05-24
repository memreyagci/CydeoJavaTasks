package _03_strings;

import java.util.Scanner;

public class GetSandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int firstIndex = str.indexOf("bread") + "bread".length();
        int lastIndex = str.lastIndexOf("bread");

        if (firstIndex != -1 && lastIndex != -1 && str.length() > 10) {
            System.out.println(str.substring(firstIndex, lastIndex));
        } else {
            System.out.println("nothing");
        }
    }
}