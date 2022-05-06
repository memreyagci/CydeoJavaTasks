package day44_Abstraction.car;

public abstract class Car {
    public final String make, model;
    public final int year;

    public String color;
    public double price;

    public Car(String make, String model, int year, String color, double price) {
        if (make.isBlank()) {
            throw new RuntimeException("Empty or null make: "+ make);
        } else {
            this.make = make;
        }

        if (model.isBlank()) {
            throw new RuntimeException("Empty or null model: "+ model);
        } else {
            this.model = model;
        }

        this.year = year;
        setColor(color);
        setPrice(price);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isBlank()) {
            throw new RuntimeException("Empty or null color: "+ color);
        } else {
            this.color = color;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new RuntimeException("Price cannot be smaller than 0: " + price);
        } else {
            this.price = price;
        }
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public abstract void start();
    public abstract void drive();

    public void stop() {
        System.out.println(getModel() + " model car is stooped.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

/*
	1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

					If invalid arguments are given for setting the instances, then manually throw an exception

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()
 */