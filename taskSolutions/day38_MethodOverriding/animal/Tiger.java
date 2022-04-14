package day38_MethodOverriding.animal;

public class Tiger extends Animal {
    public Tiger(String name, String breed, String color, int age, double size, char gender) {
        super(name, breed, color, age, size, gender);
    }

    public void eat() {
        System.out.println(getBreed() + " name " + getName() + " is eating deer.");
    }
}
