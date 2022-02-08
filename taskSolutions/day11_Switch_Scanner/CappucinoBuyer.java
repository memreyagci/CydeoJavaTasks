package day11_Switch_Scanner;

import java.util.Scanner;

public class CappucinoBuyer {
    public static void main(String[] args) {
        String size = new Scanner(System.in).nextLine();

        switch (size) {
            case "tall":
                System.out.println(size + ":\n\t\tprice is $3.69\n\t\t90 calories");
                break;

            case "grande":
                System.out.println(size + ":\n\t\tprice is $3.99\n\t\t120 calories");
                break;

            case "venti":
                System.out.println(size + ":\n\t\tprice is $4.29\n\t\t150 calories");
                break;

            default:
                System.out.println("Invalid size");
        }
    }
}

/*
	1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */
