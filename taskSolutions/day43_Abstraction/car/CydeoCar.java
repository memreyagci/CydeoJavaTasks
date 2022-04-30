package day43_Abstraction.car;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable {

    public CydeoCar(String make, String model, int year, String color, double price) {
        super(make, model, year, color, price);
    }

    @Override
    public void autoPark() {
        System.out.println(model + " model CydeoCar has been auto-parked.");
    }

    @Override
    public void selfDrive() {
        System.out.println(model + " model CydeoCar is being self-driven.");
    }

    @Override
    public void start() {
        System.out.println(model + " model CydeoCar has been started.");
    }

    @Override
    public void drive() {
        System.out.println(model + " model CydeoCar is being driven.");
    }

    @Override
    public void fly() {
        System.out.println(model + " model CydeoCar is being flown.");
    }
}
