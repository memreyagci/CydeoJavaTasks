package day33_Statics;

public class Iphone {
    public String model, color;
    public double price, size;
    public static String brand="Apple", OS="IOS", madeIn="China";

    public Iphone(String model, String color, double price, double size) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    public void faceTime(long phoneNumber) {
        System.out.println("Facetime call for number " + phoneNumber);
    }

    public void faceTime(String email) {
        System.out.println("Facetime call for email address " + email);
    }

    public void call(long phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println("Texting " + phoneNumber);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", brand=" + brand +
                ", OS=" + OS +
                ", made in=" + madeIn +
                '}';
    }
}

/*
4. IPhone Task:
		1. Creta a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */