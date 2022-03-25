package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        String[] arr1 = new String[] {"A", "B", "C"};
        String[] arr2 = new String[] {"D", "E", "F", "G"};

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.addAll(Arrays.asList(arr1));
        arrayList.addAll(Arrays.asList(arr2));

        System.out.println(arrayList);
    }
}

/*
4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */