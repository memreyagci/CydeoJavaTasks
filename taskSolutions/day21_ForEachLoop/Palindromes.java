package day21_ForEachLoop;

public class Palindromes {
    public static void main(String[] args) {
        String[] str = {"anna", "level", "Java"};
        String reversed;
        int numOfPalindromes = 0;

        for(String s: str) {
            reversed = "";

            for (int i = s.length() - 1; i >= 0; i--) {
                reversed += s.charAt(i);
            }

            if (s.equals(reversed)) {
                numOfPalindromes++;
            }
        }

        System.out.println(numOfPalindromes);
    }
}

/*
    4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */