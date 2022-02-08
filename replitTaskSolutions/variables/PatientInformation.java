package variables;

import java.util.Scanner;

public class PatientInformation {
    public static void main(String[] args) {
        //Enter your code here
        Scanner scan = new Scanner(System.in);
        String firstName,
                lastName,
                fullName,
                email,
                street,
                state,
                city,
                address,
                contacts;

        int age, zipcode;
        double height, weight;
        boolean isMarried;
        long workPhoneNumber, personalPhoneNumber;


        System.out.println("Welcome to the patient portal!\nPlease enter your personal information");

        System.out.println("Enter your first name");
        firstName = scan.nextLine();
        System.out.println("Enter your last name");
        lastName = scan.nextLine();

        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();

        // continue for city
        System.out.println("Enter your city");
        city = scan.nextLine();
        System.out.println("Enter your state");
        state = scan.nextLine();
        System.out.println("Enter your zip code");
        zipcode = scan.nextInt();
        System.out.println("Enter your work phone number");
        workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        age = scan.nextInt();
        System.out.println("Enter your height");
        height = scan.nextDouble();
        System.out.println("Enter your weight");
        weight = scan.nextDouble();
        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();

        fullName = lastName + ", " + firstName;
        address = street + ", " + city + ", " + state + " " + zipcode;
        contacts = "work phone number - " + workPhoneNumber + ", personal phone number - " + personalPhoneNumber + ", email: " + email;

        System.out.println("Patient personal information");
        System.out.printf("Full name: %s\n", fullName);
        System.out.printf("Address: %s\n", address);
        System.out.printf("Contacts: %s\n", contacts);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Height: %.1f\n", height);
        System.out.printf("Weight: %.1f pounds\n", weight);
        System.out.printf("Married?: %b\n", isMarried);
    }
}
