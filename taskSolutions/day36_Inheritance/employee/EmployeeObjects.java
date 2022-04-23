package day36_Inheritance.employee;

public class EmployeeObjects {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setInfo("Ahmad", "Java Developer", 'M', 23, 123, 3000);
        developer.coding();
        developer.fixingBugs();
        System.out.println(developer);

        Driver driver = new Driver();
        driver.setInfo("Matthew", "Truck Driver", 'M', 43, 456, 2500);
        driver.driving();
        System.out.println(driver);

        Teacher teacher = new Teacher();
        teacher.setInfo("Jack", "Physics Teacher", 'M', 28, 789, 2300);
        teacher.teaching();
        System.out.println(teacher);
    }
}

/*
	2.7 Create a class named Employee Objects and test of the subclass' objects
 */