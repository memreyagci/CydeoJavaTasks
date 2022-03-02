package day20_Arrays;

public class Classmates {
    public static void main(String[] args) {
        String[] classmates = {
                "Wade Moody",
                "Dave Rodriguez",
                "Gilbert Young",
                "Brian Guzman",
                "Miles Patterson",
                "Roberto Evans",
                "Claude Martinez",
                "Ethan Peterson",
                "Antonio Coleman",
                "Conner Eriksen"
        };

        String initials;

        for (int i = 0; i < classmates.length; i++) {
             initials = classmates[i].charAt(0) + ".";
             for (int a = 1; a < classmates[i].length(); a++) {
                 if (classmates[i].charAt(a) == ' ') {
                     initials += classmates[i].charAt(a + 1) + ".";
                 }
             }
            System.out.println(initials);
        }
    }
}

/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */