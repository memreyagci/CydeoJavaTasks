package day39_Inheritance_Encapsulation.animal;

public class Animal {
    private String name, breed, color;
    private int age;
    private double size;
    private char gender;

    public Animal(String name, String breed, String color, int age, double size, char gender) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setAge(age);
        setSize(size);
        setGender(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender != 'M' && gender != 'F') {
            System.out.println("Gender can be either M or F.");
        } else {
            this.gender = gender;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()) {
            System.out.println("Name has to be specified.");
            System.exit(1);
        } else {
            this.name = name;
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(breed.isEmpty()) {
            System.out.println("Breed has to be specified.");
            System.exit(1);
        } else {
            this.breed = breed;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty()) {
            System.out.println("Color has to be specified.");
            System.exit(1);
        } else {
            this.color = color;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be set to negative");
            System.exit(1);
        } else {
            this.age = age;
        }
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drink");
    }

    public void sleep(){
        System.out.println(name + " is sleep");
    }

    public void move(){
        System.out.println(name + " is moving");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", size=" + size +
                ", gender=" + gender +
                '}';
    }
}

/*
Animal Task:
	1. Create a class named Animal:
			variables:
				name, breed, gender, age, size, color

			Encapsulate all the fields

			Add a constructor to set all the fields

					Conditions:
						1. name, breed and color can not be null (if obj == null means it's error)
						2. name, breed and color can not be empty or can not be blank
						3. gender should only be set to either 'M' or 'F'
						4. age can not be set to negative

			Methods:
				eat()
				drink()
				sleep()
				move()
				toString()


	4. Create the following sub classes of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()

			2. Cat:
					Extra methods:
						scratch()
						meow()

			3. Dolphin:
					Extra methods:
						swim()

			4. Parrot:
					Extra methods:
						fly()
						sing()


	5. Create the following sub classes of WildAnimal and Override the hunt method, and add any extra methods that are needed:
				1. Lion
				2. Tiger
				3. Eagle
				4. Bear
				5. Python
				6. Crocodile


	6. Create a class named Zoo:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes
 */