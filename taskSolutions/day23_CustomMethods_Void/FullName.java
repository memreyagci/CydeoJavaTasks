package day23_CustomMethods_Void;

public class FullName {
    public static void main(String[] args) {
        fullName("cYdEo", "SCHOOL");
    }

    public static void fullName(String firstName, String lastName) {
        System.out.println(firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase() + " " + lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase());
    }
}

/*
	16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"
 */