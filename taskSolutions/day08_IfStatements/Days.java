package day08_IfStatements;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        byte number = s.nextByte();

        if(number == 1 ){
            System.out.println("Monday");
        }
        if(number == 2 ){
            System.out.println("Tuesday");
        }
        if(number == 3 ){
            System.out.println("Wednesday");
        }
        if(number == 4 ){
            System.out.println("Thursday");
        }
        if(number == 5){
            System.out.println("Friday");
        }
        if(number == 6 ){
            System.out.println("Saturday");
        }
        if(number == 7 ){
            System.out.println("Sunday");
        }
    }
}

/*
	2. write a program that can display the name of the day

			number = 1 ~ 7
 */