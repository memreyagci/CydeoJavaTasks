package day21_ForEachLoop;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int numbers[] = {5, 3, 4, 6, 3, 8};
        int descending[] = new int[numbers.length];
        int a = numbers.length-1;

        Arrays.sort(numbers);

        for (int i: numbers) {
            descending[a] = i;
            a--;
        }

        System.out.println(Arrays.toString(descending));
    }
}

/*
	1. Write a program that sort the array of integer in descending order
 */