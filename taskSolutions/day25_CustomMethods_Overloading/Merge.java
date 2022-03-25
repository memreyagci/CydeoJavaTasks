package day25_CustomMethods_Overloading;

public class Merge {
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


    public static double[] merge(double[] arr1, double[] arr2) {
        double[] merged = new double[arr1.length + arr2.length];

        int i = 0;
        for (double num: arr1) {
            merged[i++] = num;
        }
        for (double num: arr2) {
            merged[i++] = num;
        }

        return merged;
    }

    public static char[] merge(char[] arr1, char[] arr2) {
        char[] merged = new char[arr1.length + arr2.length];

        int i = 0;
        for (char num: arr1) {
            merged[i++] = num;
        }
        for (char num: arr2) {
            merged[i++] = num;
        }

        return merged;
    }

    public static String[] merge(String[] arr1, String[] arr2) {
        String[] merged = new String[arr1.length + arr2.length];

        int i = 0;
        for (String num: arr1) {
            merged[i++] = num;
        }
        for (String num: arr2) {
            merged[i++] = num;
        }

        return merged;
    }
}

/*
Task1:
	1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.
 */