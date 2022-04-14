package day39_Inheritance_Encapsulation.animal;

public class Eagle extends WildAnimal{
    public Eagle(String name, String breed, String color, int age, double size, char gender) {
        super(name, breed, color, age, size, gender);
    }

    @Override
    public void hunt() {
        System.out.println("Eagle "+getName()+" hunts snakes");
    }
}
