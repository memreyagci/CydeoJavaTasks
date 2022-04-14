package day39_Inheritance_Encapsulation.animal;

public class Cat extends FriendlyAnimal {
    public Cat(String name, String breed, String color, int age, double size, char gender) {
        super(name, breed, color, age, size, gender);
    }

    public void scratch() {
        System.out.println(getName() + " is scratching.");
    }

    public void meow() {
        System.out.println(getName() + " is meow.");
    }
}