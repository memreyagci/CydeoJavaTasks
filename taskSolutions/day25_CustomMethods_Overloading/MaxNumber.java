package day25_CustomMethods_Overloading;

public class MaxNumber {
    public static int maxNumber(int[] arr) {
        int max = arr[0];

        for(int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }


    public static double maxNumber(double[] arr) {
        double max = arr[0];

        for(double i : arr) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }


    public static long maxNumber(long[] arr) {
        long max = arr[0];

        for(long i : arr) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }


    public static short maxNumber(short[] arr) {
        short max = arr[0];

        for(short i : arr) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }


    public static float maxNumber(float[] arr) {
        float max = arr[0];

        for(float i : arr) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }


    public static byte maxNumber(byte[] arr) {
        byte max = arr[0];

        for(byte i : arr) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }
}

/*
Task 2:
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array
 */