package day43_Abstraction.car;

public class Tesla extends Car implements AutoPark, AutoPilot {

    public Tesla(String make, String model, int year, String color, double price) {
        super(make, model, year, color, price);
    }

    @Override
    public void autoPark() {
        System.out.println(model + " model Tesla has been auto-parked.");
    }

    @Override
    public void selfDrive() {
        System.out.println(model + " model Tesla is being self-driven.");
    }

    @Override
    public void start() {
        System.out.println(model + " model Tesla has been started.");
    }

    @Override
    public void drive() {
        System.out.println(model + " model Tesla is being driven.");
    }
}
