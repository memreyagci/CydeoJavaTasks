package day43_Abstraction.car;

public class Nio extends Car implements AutoPark, AutoPilot{

    public Nio(String make, String model, int year, String color, double price) {
        super(make, model, year, color, price);
    }

    @Override
    public void autoPark() {
        System.out.println(model + " model Nio has been auto-parked.");
    }

    @Override
    public void selfDrive() {
        System.out.println(model + " model Nio is being self-driven.");
    }

    @Override
    public void start() {
        System.out.println(model + " model Nio has been started.");
    }

    @Override
    public void drive() {
        System.out.println(model + " model Nio is being driven.");
    }
}
