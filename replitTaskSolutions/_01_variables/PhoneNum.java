package _01_variables;

import java.util.Scanner;

public class PhoneNum {
    public static void main(String[] args){

        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner scan=new Scanner(System.in);
        int areaCode=scan.nextInt();
        int localNumber=scan.nextInt();

        String phoneNumber;
        //WRITE YOUR CODE HERE:
        phoneNumber = "(" + areaCode + ")-" + localNumber;
        System.out.printf("Calling number %s", phoneNumber);
    }
}
