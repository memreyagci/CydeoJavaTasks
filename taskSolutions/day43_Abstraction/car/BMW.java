package day43_Abstraction.car;

public class BMW extends Car {

    public BMW(String make, String model, int year, String color, double price) {
        super(make, model, year, color, price);
    }

    @Override
    public void start() {
        System.out.println(model + " model BMW has been started.");
    }

    @Override
    public void drive() {
        System.out.println(model + " model BMW is being driven.");
    }
}
