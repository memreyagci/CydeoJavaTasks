package day08_IfStatements;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        byte number = s.nextByte();

        if(number == 1 ){
            System.out.println("january");
        }
        if(number == 2 ){
            System.out.println("february");
        }
        if(number == 3 ){
            System.out.println("march");
        }
        if(number == 4 ){
            System.out.println("april");
        }
        if(number == 5){
            System.out.println("may");
        }
        if(number == 6 ){
            System.out.println("june");
        }
        if(number == 7 ){
            System.out.println("july");
        }
        if(number == 8 ){
            System.out.println("august");
        }
        if(number == 9 ){
            System.out.println("september");
        }
        if(number == 10 ){
            System.out.println("october");
        }
        if(number == 11  ){
            System.out.println("november");
        }
        if(number == 12 ){
            System.out.println("december");
        }
    }
}

/*
	1. write a program that can display the name of the month

			number = 1 ~ 12
 */