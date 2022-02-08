package variables;

import java.util.Scanner;

public class CaffeineOverDose {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:
        System.out.println("Enter number of milligrams in drink:");
        int numOfMilligrams = new Scanner(System.in).nextInt();

        System.out.printf("It would take about %d drinks for a lethal overdose.", 10 * 1000 / numOfMilligrams);
    }
}
