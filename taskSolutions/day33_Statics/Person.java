package day33_Statics;

public class Person {
    public int age;
    public String name;
    public char gender;

    public static boolean isHuman = true, hasNose = true, hasWings = false;
    public static int numberOfHead = 1, numberOfEyes = 2;

    public Person(int age, String name, char gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void eat(String food) {
        System.out.println(name + "is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + "is drinking " + drink);
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}


/*
3. Person Task:
		1. Create a class named Person:

				Attributes:
					instance: name, age, gender

					static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,

				Add a constructor that can set All the fields (instances)


				Actions:
					eat(String food)
					drink(String drink)
					sleep()
					toString()
 */