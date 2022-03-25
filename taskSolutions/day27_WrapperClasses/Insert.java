package day27_WrapperClasses;

import java.util.Arrays;

public class Insert {
    public static int[] insert(int[] arr, int index, int element) {
        int[] result = new int[arr.length + 1];

        int a = 0;
        for(int b = 0; b < result.length; b++) {
            if(b == index) {
                result[b] = element;
            } else {
                result[b] = arr[a++];
            }
        }

        return result;
    }


    public static double[] insert(double[] arr, int index, double element) {
        double[] result = new double[arr.length + 1];

        int a = 0;
        for(int b = 0; b < result.length; b++) {
            if(b == index) {
                result[b] = element;
            } else {
                result[b] = arr[a++];
            }
        }

        return result;
    }


    public static char[] insert(char[] arr, int index, char element) {
        char[] result = new char[arr.length + 1];

        char a = 0;
        for(int b = 0; b < result.length; b++) {
            if(b == index) {
                result[b] = element;
            } else {
                result[b] = arr[a++];
            }
        }

        return result;
    }


    public static String[] insert(String[] arr, int index, String element) {
        String[] result = new String[arr.length + 1];

        int a = 0;
        for(int b = 0; b < result.length; b++) {
            if(b == index) {
                result[b] = element;
            } else {
                result[b] = arr[a++];
            }
        }

        return result;
    }
}

/*
1. Insert Task:
		1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element. the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array

 */