package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int max = arrayList.get(0);

        for(int each : arrayList) {
            if (each < max) {
                max = each;
            }
        }

        System.out.println(max);
    }
}

/*
6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1

 */