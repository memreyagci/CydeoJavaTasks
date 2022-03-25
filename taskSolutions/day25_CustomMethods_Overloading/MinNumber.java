package day25_CustomMethods_Overloading;

public class MinNumber {
    public static int minNumber(int[] arr) {
        int max = arr[0];

        for(int i : arr) {
            if (i < max) {
                max = i;
            }
        }

        return max;
    }


    public static double minNumber(double[] arr) {
        double max = arr[0];

        for(double i : arr) {
            if (i < max) {
                max = i;
            }
        }

        return max;
    }


    public static long minNumber(long[] arr) {
        long max = arr[0];

        for(long i : arr) {
            if (i < max) {
                max = i;
            }
        }

        return max;
    }


    public static short minNumber(short[] arr) {
        short max = arr[0];

        for(short i : arr) {
            if (i < max) {
                max = i;
            }
        }

        return max;
    }


    public static float minNumber(float[] arr) {
        float max = arr[0];

        for(float i : arr) {
            if (i < max) {
                max = i;
            }
        }

        return max;
    }


    public static byte minNumber(byte[] arr) {
        byte max = arr[0];

        for(byte i : arr) {
            if (i < max) {
                max = i;
            }
        }

        return max;
    }
}

/*
Task 3:
	1. create a method that can return the min number from an integer array

	2. create a method that can return the min number from double array

	3. create a method that can return the min number from long array

	4. create a method that can return the min number from short array

	5. create a method that can return the min number from float array

	6. create a method that can return the min number from byte array
 */