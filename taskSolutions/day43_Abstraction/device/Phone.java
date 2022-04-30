package day43_Abstraction.device;

public abstract class Phone extends Device {

    public Phone(String brand, String model, String size, boolean hasBattery, boolean hasPowerButton, String color, double price) {
        super(brand, model, size, hasBattery, hasPowerButton, color, price);
    }

    public void call(long phoneNum) {
        System.out.println(getBrand() + " " + getModel() + " is calling " + phoneNum);
    }

    public void text(long phoneNum) {
        System.out.println(getBrand() + " " + getModel() + " is texting " + phoneNum);
    }

    @Override
    public String toString() {
        return "Phone{}";
    }
}

/*
	2. Create a child abstract class of Device named Phone:

				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()
 */