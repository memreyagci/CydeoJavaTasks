package day39_Inheritance_Encapsulation.animal;

public class Bear extends WildAnimal{

    public Bear(String name, String breed, String color, int age, double size, char gender) {
        super(name, breed, color, age, size, gender);
    }

    @Override
    public void hunt() {
        System.out.println("Bear " + getName() + " hunts fish");
    }
}
