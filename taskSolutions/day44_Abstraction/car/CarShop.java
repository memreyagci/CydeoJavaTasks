package day44_Abstraction.car;

public class CarShop {
    public static void main(String[] args) {
        Audi audi = new Audi("China", "A3", 2006, "white", 10000);
        audi.toString();
        audi.start();
        audi.autoPark();
        audi.autoPark();
        audi.stop();

        BMW bmw = new BMW("Germany", "S70", 2019, "black", 30000);
        bmw.toString();
        bmw.start();
        bmw.drive();
        bmw.stop();

        CydeoCar cydeoCar = new CydeoCar("US", "X1", 2022, "silver", 5000000);
        cydeoCar.toString();
        cydeoCar.start();
        cydeoCar.drive();
        cydeoCar.selfDrive();
        cydeoCar.fly();
        cydeoCar.autoPark();
        cydeoCar.stop();

        Honda honda = new Honda("Germany", "SL90", 2020, "black", 35000);
        honda.toString();
        honda.start();
        honda.drive();
        honda.stop();

        Mercedes mercedes = new Mercedes("Germany", "X500", 2021, "black", 100000);
        mercedes.toString();
        mercedes.start();
        mercedes.drive();
        mercedes.autoPark();
        mercedes.stop();

        Nio nio = new Nio("Japan", "L1", 2017, "silver", 25500);
        nio.toString();
        nio.start();
        nio.drive();
        nio.selfDrive();
        nio.autoPark();
        nio.stop();

        Tesla tesla = new Tesla("US", "X", 2020, "silver", 75000);
        tesla.toString();
        tesla.start();
        tesla.drive();
        tesla.selfDrive();
        tesla.autoPark();
        tesla.stop();

        Toyota toyota = new Toyota("Germany", "S100", 2020, "black", 15000);
        toyota.toString();
        toyota.start();
        toyota.drive();
        toyota.stop();
    }
}