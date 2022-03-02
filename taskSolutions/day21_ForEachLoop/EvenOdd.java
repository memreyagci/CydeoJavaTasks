package day21_ForEachLoop;

public class EvenOdd {
    public static void main(String[] args) {
        int numbers[] = {5, 33, 4, 6, 3, 12};
        int numOfEven = 0;
        int numOfOdd = 0;

        for (int i: numbers) {
            if (i % 2 == 0) {
                numOfEven++;
            } else {
                numOfOdd++;
            }
        }

        System.out.printf("There are %d even and %d odd numbers in the array.", numOfEven, numOfOdd);
    }
}

/*
2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */