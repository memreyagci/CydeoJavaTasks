package variables;

import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
        //YOUR CODE HERE:
        Scanner s = new Scanner(System.in);
        int inputSeconds, hours, minutes, seconds;

        System.out.println("Enter seconds:");
        inputSeconds = s.nextInt();

        hours = inputSeconds / 3600;
        minutes = inputSeconds % 3600 / 60;
        seconds = inputSeconds % 60;

        System.out.printf("%d hours, %d minutes, and %d seconds", hours, minutes, seconds);
    }
}
