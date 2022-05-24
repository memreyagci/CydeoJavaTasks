package day46_Polymorphism;

import day38_Inheritance.carTask.BMW;
import day38_Inheritance.carTask.Car;
import day38_Inheritance.carTask.Tesla;
import day38_Inheritance.carTask.Toyota;

public class CarObjects {
    public static void main(String[] args) {
        Car toyota = new Toyota("Highlander", 2010, 25000, "White", 255000);

        // sadece Car class inda olan seyleri kullanabilip
        // Toyotaya oncelik verilmesi

        Car[] cars = {
                new Toyota("Highlander", 2010, 25000, "White", 255000),
                new BMW("X5", 2014, 32000, "Red", 12000),
                new Toyota("Corolla", 2011, 20000, "White", 310000),
                new BMW("M3", 2015, 33000, "Blue", 14030),
                new BMW("M5", 2017, 35000, "Black", 15000),
                new BMW("M4", 2018, 40000, "White", 19000),
                new BMW("7 Series", 2009, 30000, "Purple", 21000),
                new BMW("i3", 2011, 30000, "Black", 9000),
                new Toyota("Camry", 2018, 30000, "Red", 185000),
                new Toyota("Rav4", 2012, 23000, "Red", 285000),
                new Toyota("Avalon", 2019, 35000, "Blue", 175230),
                new Tesla("Model 3", 2015, 45000, "White", 235000),
                new Tesla("Model Y", 2017, 65000, "Black", 135000),
                new Tesla("Model X", 2016, 48000, "White", 235000),
                new Tesla("Model X", 2014, 48000, "White", 236000),
        };

        for (Car eachCar : cars) {
            if (eachCar instanceof Toyota) {
                if (eachCar.year >= 2010 && eachCar.year <= 2011) {
                    System.out.println(eachCar);
                }
            }

            if (eachCar instanceof BMW) {
                if (eachCar.year >= 1929 && eachCar.year <= 2022) {
                    System.out.println(eachCar);
                }
            }

            if (eachCar instanceof Tesla) {
                if (eachCar.year >= 2015 && eachCar.year <= 2016) {
                    System.out.println(eachCar);
                }
            }
        }


        Car highestMileage = cars[0], lowestMileage = cars[0];

        for (Car eachCar : cars) {
            if (eachCar.miles > highestMileage.miles) {
                highestMileage = eachCar;
            }

            if (eachCar.miles < lowestMileage.miles) {
                lowestMileage = eachCar;
            }

        }

        System.out.println("Car with the highest mileage: " + highestMileage);
        System.out.println("Car with the lowest mileage: " + lowestMileage);
    }
}