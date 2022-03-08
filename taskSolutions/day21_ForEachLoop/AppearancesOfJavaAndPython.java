package day21_ForEachLoop;

public class AppearancesOfJavaAndPython {
    public static void main(String[] args) {
        String[] sentence = {"java and python are the most known programming languages", "java is an OOP."};
        int numOfPython = 0;
        int numOfJava = 0;

        for (String s: sentence) {
            for (int i = 0; i < s.length() - 3; i++) {
                if(s.substring(i, i + 4).equals("java")) {
                    numOfJava++;
                }
            }
            for (int i = 0; i < s.length() - 5; i++) {
                if(s.substring(i, i + 6).equals("python")) {
                    numOfPython++;
                }
            }
        }

        System.out.printf("python: %d, java: %d", numOfPython, numOfJava);
    }
}

/*
	6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
 */