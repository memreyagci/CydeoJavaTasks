package day43_Abstraction.device;

public class Desktop extends Computer {
    public Desktop(String brand, String model, String size, boolean hasBattery, boolean hasPowerButton, String color, double price) {
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
