package day39_Inheritance_Encapsulation.animal;

public class Dog extends FriendlyAnimal {
    public Dog(String name, String breed, String color, int age, double size, char gender) {
        super(name, breed, color, age, size, gender);
    }

    public void bark() {
        System.out.println(getName() + " is barking.");
    }
}