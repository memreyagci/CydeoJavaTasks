package day24_CustomMethods_Returns;

public class Contains {
    public static void main(String[] args) {
        System.out.println(contains(new int[]{1, 2, 3, 4, 5, 6, 7}, 10));
    }

    public static boolean contains(int[] arr, int num) {
        for(int i: arr) {
            if(i == num) {
                return true;
            }
        }

        return false;
    }
}

/*
	9. Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
 */