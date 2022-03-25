package day24_CustomMethods_Returns;

public class ReverseArray {
    public static void main(String[] args) {

    }

    public static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];

        int a = 0;
        for (int b = arr.length - 1; b >= 0; b--) {
            reversed[a++] = arr[b];
        }

        return reversed;
    }
}

/*
	8. Create method named reverse that passes an integer array parameter, the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}
 */