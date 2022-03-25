package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapFirstAndLast {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int temp = arrayList.get(0);

        arrayList.set(0, arrayList.get(arrayList.size() - 1));
        arrayList.set(arrayList.size() - 1, temp);

        System.out.println(arrayList);
    }
}

/*
2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];
 */