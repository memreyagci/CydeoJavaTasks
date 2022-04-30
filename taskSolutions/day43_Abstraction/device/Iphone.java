package day43_Abstraction.device;

public class Iphone extends Phone implements Downloadable, AppleApps {
    public Iphone(String brand, String model, String size, boolean hasBattery, boolean hasPowerButton, String color, double price) {
        super(brand, model, size, hasBattery, hasPowerButton, color, price);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " is turned off.");
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading the app from " + appStoreName + " to its " + OS + " operating system.");
    }
}

/*
	7. Create the following sub classes of Phone and add any extra methods that are needed:

				1. Iphone :
						extends Phone class and implements Downloadable & AppleApps interfaces
 */