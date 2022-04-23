package day36_Inheritance.scrum;

public class Person {
    private String name;
    private int age;
    private char gender;

    public void setInfo(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()) {
            System.err.println("Name has to be specified");
            System.exit(1);
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.err.println("Age should be between 0-150");
            System.exit(1);
        } else {
            this.age = age;
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("Gender can be either M or F");
            System.exit(1);
        } else {
            this.gender = gender;
        }
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}

/*
1. Create a class named Person
			variables:
				name, age, gender

			methods:
				setInfo(): sets the name, age, gender of person
				eat(String food)
				drink(String drink)
				toString()
 */