package day20_Arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] numbers = {10, 0, 5, 0, 1, 0};

        // `k` stores the index of the next available position
        int k = 0;

        // do for each element
        for (int i: numbers) {
            // if the current element is non-zero, put the element at the
            // next free position in the array
            if (i != 0) {
                numbers[k++] = i;
            }
        }

        // move all 0's to the end of the array (remaining indices)
        for (int i = k; i < numbers.length; i++) {
            numbers[i] = 0;
        }

        System.out.println(Arrays.toString(numbers));
    }
}

/*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */