package day44_Abstraction.car;

public class Audi extends Car implements AutoPark {
    public Audi(String make, String model, int year, String color, double price) {
        super(make, model, year, color, price);
    }

    @Override
    public void autoPark() {
        System.out.println(model + " model Audi has been auto-parked.");
    }

    @Override
    public void start() {
        System.out.println(model + " model Audi has been started.");
    }

    @Override
    public void drive() {
        System.out.println(model + " model Audi is being driven.");
    }
}
