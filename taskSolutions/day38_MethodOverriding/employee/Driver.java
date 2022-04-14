package day38_MethodOverriding.employee;

public class Driver extends Employee {
    public Driver(String name, String jobTitle, String companyName, int age, int id, double salary) {
        super(name, jobTitle, companyName, age, id, salary);
    }

    public void work() {
        System.out.println(getName() + "is working as a driver at " + getCompanyName());
    }
}
