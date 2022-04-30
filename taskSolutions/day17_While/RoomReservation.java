package day17_While;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String reservation = "", roomType = "";

        while (!reservation.equalsIgnoreCase("yes") && !reservation.equalsIgnoreCase("no")) {
            System.out.println("Do you want to reserve a room?");
            reservation = scan.nextLine();

            if (reservation.equalsIgnoreCase("yes")) {
                while (!roomType.equalsIgnoreCase("King Bed") && !roomType.equalsIgnoreCase("Queen Bed") && !roomType.equalsIgnoreCase("Single Bed")) {
                    System.out.println("Which type of room do you want?");
                    roomType = scan.nextLine();

                    if (roomType.equalsIgnoreCase("King Bed")) {
                        System.out.println("King Bed ==> 120$");
                    } else if (roomType.equalsIgnoreCase("Queen Bed")) {
                        System.out.println("Queen Bed ==> 100$");
                    } else if (roomType.equalsIgnoreCase("Single Bed")) {
                        System.out.println("Single Bed ==> 80$");
                    }
                }
            } else if (reservation.equalsIgnoreCase("no")) {
                System.out.println("Have a nice day");
            }
        }
        scan.close();
    }
}

/*
5. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
        if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
                (if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

                King Bed ==> 120$
                Queen Bed ==> 100$
                single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */