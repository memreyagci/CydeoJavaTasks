package basics;

import java.util.Scanner;

public class PrintVariable3 {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // variables are already declared, all you have to do is to use the variables that are given
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        double cost = in.nextDouble();

        //write your code here:
        System.out.printf("num= %d\ncost= %.1f", num, cost);
    }
}
