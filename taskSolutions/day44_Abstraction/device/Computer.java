package day44_Abstraction.device;

public abstract class Computer extends Device {
    public Computer(String brand, String model, String size, boolean hasBattery, boolean hasPowerButton, String color, double price) {
        super(brand, model, size, hasBattery, hasPowerButton, color, price);
    }
}

/*
	3. Create a child abstract class of Device named Computer:

					Add any extra methods if needed
 */