package day23_CustomMethod;


public class Elements {
    public static void main(String[] args) {
        int[] numbers = {3,2,3,67,7,45,3,6,65};

        printEachElement(numbers);
    }

    public static void printEachElement(int[] numbers) {
        for (int num: numbers) {
            System.out.println(num);
        }
    }
}

/*
	14. create a method named printEachElement that can print each elements of an integer array
 */