package day39_Inheritance_Encapsulation.animal;

public class WildAnimal extends Animal {
    public static boolean isWild=true, isFriendly=false, isPlayable=false;

    public WildAnimal(String name, String breed, String color, int age, double size, char gender) {
        super(name, breed, color, age, size, gender);
    }

    public void hunt() {
        System.out.println(getName() + " is hunting.");
    }
}

/*
	3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()
 */