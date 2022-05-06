package day44_Abstraction.car;

public class Honda extends Car {

    public Honda(String make, String model, int year, String color, double price) {
        super(make, model, year, color, price);
    }

    @Override
    public void start() {
        System.out.println(model + " model Honda has been started.");
    }

    @Override
    public void drive() {
        System.out.println(model + " model Honda is being driven.");
    }
}
