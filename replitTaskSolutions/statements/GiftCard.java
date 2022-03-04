package statements;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        int balance = 100;
        String item = new Scanner(System.in).nextLine();
        String output = "Thank you for your purchase! \nYour current balance is: ";

        if (item.equalsIgnoreCase("blanket")) {
            System.out.println(output + (balance - 60) + "$");
        } else if (item.equalsIgnoreCase("charger")) {
            System.out.println(output + (balance - 25) + "$");
        } else if (item.equalsIgnoreCase("hat")) {
            System.out.println(output + (balance - 25) + "$");
        } else if (item.equalsIgnoreCase("headphones")) {
            System.out.println(output + (balance - 30) + "$");
        } else if (item.equalsIgnoreCase("laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equalsIgnoreCase("pants")) {
            System.out.println(output + (balance - 50) + "$");
        } else if (item.equalsIgnoreCase("pillow")) {
            System.out.println(output + (balance - 40) + "$");
        } else if (item.equalsIgnoreCase("smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equalsIgnoreCase("socks")) {
            System.out.println(output + (balance - 5) + "$");
        } else if (item.equalsIgnoreCase("usb cable")) {
            System.out.println(output + (balance - 10) + "$");
        } else {
            System.out.println("Invalid item!");
        }
    }
}

/*
Similar to Vending Machine

Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase.

    If item is not in the list, display message: "Invalid item!".
    If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".

    List of items Blanket - 60$ Charger - 25$ Hat - 25$ Headphones - 30$ Laptop - 200$ Pants - 50$ Pillow - 40$ Smartphone - 1000$ Socks - 5$ USB cable - 10$

Hint: if/ else if / else or switch statement

Examples:

input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$

input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$
input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$

input: Laptop
Output:
Sorry, not enough funds on your gift card!
input: Laptop
Output:
Sorry, not enough funds on your gift card!

input: Cupcake
output: Invalid item!
 */