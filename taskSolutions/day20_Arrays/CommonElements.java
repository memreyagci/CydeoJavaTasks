package day20_Arrays;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};

        for (int i: arr1) {
            for (int a: arr2) {
                if (i == a) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}

/*
7. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */