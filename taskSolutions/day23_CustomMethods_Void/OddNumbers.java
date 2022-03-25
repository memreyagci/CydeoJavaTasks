package day23_CustomMethods_Void;

public class OddNumbers {
    public static void main(String[] args) {
        getOddNumbers();
    }

    public static void getOddNumbers() {
        for (int i = 1; i <= 100; i+=2) {
            System.out.print(i + " ");
        }
    }
}

/*
	1. create a method that can print odd numbers between 1~100 in a same line saperated by space
 */