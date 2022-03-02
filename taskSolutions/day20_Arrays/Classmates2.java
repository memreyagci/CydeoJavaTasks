package day20_Arrays;

public class Classmates2 {
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

        for (int i = 0; i < classmates.length; i++) {
            String reverse = "";
            for (int a = classmates[i].length() - 1; a >= 0; a--) {
                reverse += classmates[i].charAt(a);
            }
            System.out.println(reverse);
        }
    }
}

/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */