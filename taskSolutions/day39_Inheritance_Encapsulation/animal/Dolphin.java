package day39_Inheritance_Encapsulation.animal;

public class Dolphin extends FriendlyAnimal {
    public Dolphin(String name, String breed, String color, int age, double size, char gender) {
        super(name, breed, color, age, size, gender);
    }

    public void swim() {
        System.out.println(getName() + " is swimming.");
    }
}
