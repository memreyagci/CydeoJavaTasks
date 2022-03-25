package day24_CustomMethods_Returns;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];

        int i = 0;
        for (int num: arr1) {
            merged[i++] = num;
        }
        for (int num: arr2) {
            merged[i++] = num;
        }

        return merged;
    }
}

/*
	7. Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}
 */