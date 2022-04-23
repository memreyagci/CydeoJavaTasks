package day36_Inheritance.employee;

public class Employee {
    public String name, jobTitle;
    public char gender;
    public int age, id;
    public double salary;

    public void setInfo(String name, String jobTitle, char gender, int age, int id, double salary) {
        this.jobTitle = jobTitle;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + "is working as a " + jobTitle);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

/*
2. Employee Task:
	2.1 Create a class named Employee:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				toString()
 */