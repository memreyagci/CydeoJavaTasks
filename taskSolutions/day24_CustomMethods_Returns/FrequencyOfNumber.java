package day24_CustomMethods_Returns;

public class FrequencyOfNumber {
    public static void main(String[] args) {
        int[] array ={1,1,1,1,1,2,2};

        System.out.println(frequencyOfNumber(array, 1));

    }

    public static int frequencyOfNumber(int[] arr, int num) {
        int count = 0;

        for (int i: arr) {
            if (num == i) {
                count++;
            }
        }

        return count;
    }
}

/*
    5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
 */