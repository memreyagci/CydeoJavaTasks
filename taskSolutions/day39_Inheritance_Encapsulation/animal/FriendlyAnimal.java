package day39_Inheritance_Encapsulation.animal;

public class FriendlyAnimal extends Animal {
    public static boolean isWild=false, isFriendly=true, isPlayable=true;

    public FriendlyAnimal(String name, String breed, String color, int age, double size, char gender) {
        super(name, breed, color, age, size, gender);
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

    public void play(){
        System.out.println(getName() + " is playing");
    }

    public void pet(){
        System.out.println(getName() + " is being pet.");
    }
}

/*
	2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */