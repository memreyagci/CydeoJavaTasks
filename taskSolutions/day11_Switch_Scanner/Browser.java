package day11_Switch_Scanner;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        String browserName = new Scanner(System.in).nextLine();

        switch (browserName) {
            case "chrome":
                break;

            case "firefox":
                break;

            case "opera":
                break;

            case "safari":
                break;

            case "edge":
                break;

            default:
                System.out.println("Invalid Browser");
        }
    }
}

/*
	3.  write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */