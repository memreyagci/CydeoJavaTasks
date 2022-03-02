package day20_Arrays;

public class Grades {
    public static void main(String[] args) {
        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[names.length];

        for (int i = 0; i < names.length; i++) {
            if (scores[i] >= 90) {
                grades[i] = 'A';
            } else if (scores[i] >= 80) {
                grades[i] = 'B';
            } else if (scores[i] >= 70) {
                grades[i] = 'C';
            } else if (scores[i] >= 60) {
                grades[i] = 'D';
            } else if (scores[i] >= 50) {
                grades[i] = 'E';
            } else if (scores[i] >= 40) {
                grades[i] = 'F';
            } else if (scores[i] >= 30) {
                grades[i] = 'G';
            } else if (scores[i] >= 20) {
                grades[i] = 'H';
            } else if (scores[i] >= 10) {
                grades[i] = 'I';
            } else if (scores[i] >= 0) {
                grades[i] = 'J';
            }

            System.out.printf("%s's score is %d, and grade is %c\n", names[i], scores[i], grades[i]);
        }
    }
}

/*
4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A
 */