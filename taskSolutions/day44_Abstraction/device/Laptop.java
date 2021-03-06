package day44_Abstraction.device;

public class Laptop extends Computer {
    public Laptop(String brand, String model, String size, boolean hasBattery, boolean hasPowerButton, String color, double price) {
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
}
