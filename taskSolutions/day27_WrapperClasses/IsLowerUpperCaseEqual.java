package day27_WrapperClasses;

public class IsLowerUpperCaseEqual {
    public static void main(String[] args) {
        String str = "JAVA java";
        int numOfLower = 0;
        int numOfUpper = 0;

        for(char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                numOfUpper++;
            } else if (Character.isLowerCase(c)) {
                numOfLower++;
            }
        }

        if (numOfLower == numOfUpper) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

/*
4. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
 */