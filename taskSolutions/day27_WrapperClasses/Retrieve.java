package day27_WrapperClasses;

public class Retrieve {
    public static void main(String[] args) {
        String str = "Wooden Spoon!";

        String letters = "",
                digits = "",
                specialChars = "";

        for (char c : str.toCharArray()) {
            if(Character.isLetter(c)){
                letters += c;
            }else if(Character.isDigit(c)) {
                digits += c;
            }else {
                specialChars += c;
            }
        }

        System.out.println("letters: " + letters);
        System.out.println("digits: " + digits);
        System.out.println("specialChars: " + specialChars);
    }
}

/*
3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */