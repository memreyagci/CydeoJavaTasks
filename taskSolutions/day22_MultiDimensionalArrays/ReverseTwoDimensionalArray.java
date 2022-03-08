package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ReverseTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[][] { {1,2,3}, {4,5,6}};
        int[][] reversed = new int[array.length][3];

        int k = 0, b = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            for (int a = array[i].length - 1; a >= 0; a--) {
                reversed[k][b++] = array[i][a];
            }
            b = 0;
            k++;
        }

        System.out.println(Arrays.deepToString(reversed));
    }
}

/*
1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
 */