package day25_CustomMethods_Overloading;

public class Reverse {
    public static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];

        int a = 0;
        for (int b = arr.length - 1; b >= 0; b--) {
            reversed[a++] = arr[b];
        }

        return reversed;
    }

    public static double[] reverse(double[] arr) {
        double[] reversed = new double[arr.length];

        int a = 0;
        for (int b = arr.length - 1; b >= 0; b--) {
            reversed[a++] = arr[b];
        }

        return reversed;
    }

    public static char[] reverse(char[] arr) {
        char[] reversed = new char[arr.length];

        char a = 0;
        for (int b = arr.length - 1; b >= 0; b--) {
            reversed[a++] = arr[b];
        }

        return reversed;
    }

    public static String[] reverse(String[] arr) {
        String[] reversed = new String[arr.length];

        int a = 0;
        for (int b = arr.length - 1; b >= 0; b--) {
            reversed[a++] = arr[b];
        }

        return reversed;
    }
}

/*
Task 4:
	1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array
 */