package day43_Abstraction.device;

public class Samsung extends Phone implements Downloadable, AndroidApps {
    public Samsung(String brand, String model, String size, boolean hasBattery, boolean hasPowerButton, String color, double price) {
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
				2. Samsung:
						extends Phone class and implements Downloadable & AndroidApps interfaces
 */