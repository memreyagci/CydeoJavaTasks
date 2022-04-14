package day39_Inheritance_Encapsulation.animal;

public class Dog extends FriendlyAnimal {
    public Dog(String name, String breed, String color, int age, double size) {
        super(name, breed, color, age, size);
    }

    public void bark() {
        System.out.println(getName() + " is barking.");
    }
}