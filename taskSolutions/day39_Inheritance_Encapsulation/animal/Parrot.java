package day39_Inheritance_Encapsulation.animal;

public class Parrot extends FriendlyAnimal {
    public Parrot(String name, String breed, String color, int age, double size, char gender) {
        super(name, breed, color, age, size, gender);
    }

    public void fly() {
        System.out.println(getName() + " is flying.");
    }

    public void sing() {
        System.out.println(getName() + " is singing.");
    }
}
