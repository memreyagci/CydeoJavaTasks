package day39_Inheritance_Encapsulation.animal;

public class Python extends WildAnimal{
    public Python(String name, String breed, String color, int age, double size, char gender) {
        super(name, breed, color, age, size, gender);
    }

    @Override
    public void hunt() {
        System.out.println("Python "+getName()+" hunts lizards");
    }

}
