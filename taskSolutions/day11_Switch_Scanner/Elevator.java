package day11_Switch_Scanner;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        byte floorNumber = new Scanner(System.in).nextByte();

        switch (floorNumber) {
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break;

            case 2:
                System.out.println("FFloor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break;

            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
                break;

            default:
                System.out.println("Invalid floor - " + floorNumber);
        }
    }
}

/*
	2. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */