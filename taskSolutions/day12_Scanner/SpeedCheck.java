package day12_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        int speedLimit = 50;
        int currentSpeed = new Scanner(System.in).nextInt();

        if (currentSpeed > speedLimit) {
            System.out.println("You're driving " + (currentSpeed - speedLimit)  +" mph over the limit. Slow down!");
        }
    }
}

/*
2. Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!
 */