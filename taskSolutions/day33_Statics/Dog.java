package day33_Statics;

public class Dog {
    public String breed, color;
    public char gender;
    public int size, age;
    public static int numberOfLegs=4, numberOfEyes=2, numberOfWings=0;
    public static boolean isFriendly = true;

    public Dog(String breed, String color, char gender, int size, int age) {
        this.breed = breed;
        this.color = color;
        this.gender = gender;
        this.size = size;
        this.age = age;
    }

    public void eat() {
        System.out.println(breed + " breed dog is eating");
    }

    public void sleep() {
        System.out.println(breed + " breed dog is sleeping");
    }

    public void play() {
        System.out.println(breed + " breed dog is playing");
    }

    @Override
    public String toString() {
        return "animal.Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", age=" + age +
                ", number of legs=" + numberOfLegs +
                ", number of eyes=" + numberOfEyes +
                ", number of wings=" + numberOfWings +
                ", is friendly=" + isFriendly +
                '}';
    }
}

/*
6. animal.Dog Task:
		1. Create a class called animal.Dog
	            Attributes:
	            	instance: breed, size, gender, age, color
	            	statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly

	            Add a constructor to initialized all the fields (instances)

	            Methods:
	            	eat()
	            	sleep()
	            	play()
	                toString()
 */