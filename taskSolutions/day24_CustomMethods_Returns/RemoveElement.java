package day24_CustomMethods_Returns;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeElement(new int[]{10, 20, 30, 40, 50, 60}, 2)));
    }

    public static int[] removeElement(int[] arr, int index) {
        int[] removed = new int[arr.length - 1];

        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            removed[j++] = arr[i];
        }

        return removed;
    }
}

/*
	10. create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}
 */