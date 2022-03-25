package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyOddNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        for (int i = 0; i < arrayList.size(); i++) {
            int num = arrayList.get(i);
            if (num % 2 == 1) {
                arrayList.set(i, num * 2);
            }
        }

        System.out.println(arrayList);
    }
}

/*
3. write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]
 */