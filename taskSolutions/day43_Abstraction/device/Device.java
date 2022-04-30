package day43_Abstraction.device;

public abstract class Device {
    private final String brand, model, size;

    private boolean hasBattery, hasPowerButton;
    private String color;
    private double price;

    public Device(String brand, String model, String size, boolean hasBattery, boolean hasPowerButton, String color, double price) {
        if (brand.isEmpty()) {
            throw new RuntimeException("Brand cannot be null or empty:" + brand);
        } else {
            this.brand = brand;
        }

        if (model.isEmpty()) {
            throw new RuntimeException("Model cannot be null or empty:" + model);
        } else {
            this.model = model;
        }

        if (size.isEmpty()) {
            throw new RuntimeException("Size cannot be null or empty:" + size);
        } else {
            this.size = size;
        }

        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
        setColor(color);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            throw new RuntimeException("Color cannot be null or empty:" + color);
        } else {
            this.color = color;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new RuntimeException("Price cannot be less than or equal to 0:" + price);
        } else {
            this.price = price;
        }
    }

    public abstract void turnOn();

    public abstract void turnOff();

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}

/*
	1. Create an abstract class named Device:
			Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model color and size can not be null (if obj == null means it's error)
							2. brand, model color and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price
 */