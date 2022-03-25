package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicatedElement {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

        int former = arrayList.get(0);

        for (int i = 1; i < arrayList.size(); i++) {
            if (former == arrayList.get(i)) {
                System.out.println(former);
                break;
            } else {
                former = arrayList.get(i);
            }
        }
    }
}

/*
7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
 */