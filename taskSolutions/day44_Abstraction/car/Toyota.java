package day44_Abstraction.car;

public class Toyota extends Car {
    public Toyota(String make, String model, int year, String color, double price) {
        super(make, model, year, color, price);
    }

    @Override
    public void start() {
        System.out.println(model + " model Toyota has been started.");
    }

    @Override
    public void drive() {
        System.out.println(model + " model Toyota is being driven.");
    }
}
