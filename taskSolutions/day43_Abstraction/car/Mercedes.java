package day43_Abstraction.car;

public class Mercedes extends Car implements AutoPark {

    public Mercedes(String make, String model, int year, String color, double price) {
        super(make, model, year, color, price);
    }

    @Override
    public void autoPark() {
        System.out.println(model + " model Mercedes have been auto-parked.");
    }

    @Override
    public void start() {
        System.out.println(model + " model Mercedes has been started.");
    }

    @Override
    public void drive() {
        System.out.println(model + " model Mercedes is being driven.");
    }
}
