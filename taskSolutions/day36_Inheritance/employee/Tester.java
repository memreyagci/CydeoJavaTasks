package day36_Inheritance.employee;

public class Tester extends Employee {
    public void testing() {
        System.out.println(jobTitle + " " + name  + " is testing the code.");
    }

    public void createTicket(){
        System.out.println(jobTitle + " " + name + " is creating a ticket.");
    }
}

/*
	2.2 Create the sub class of Employee named Tester:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				testing()
				creatingTicket()
				toString()
 */