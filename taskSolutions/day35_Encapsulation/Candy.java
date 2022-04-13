package day35_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity <= 0) {
            System.err.println("Invalid quantity: " + quantity);
            System.exit(1);
        } else {
            this.quantity = quantity;
        }    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0) {
            System.err.println("Invalid price: " + price);
            System.exit(1);
        } else {
            this.price = price;
        }
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + (price <= 0 ? "free" : price) +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}

class CandyFactory {
    public static void main(String[] args) {
        ArrayList<Candy> candies = new ArrayList<>();
        Candy candy1 = new Candy("A", 2, 3, true);
        Candy candy2 = new Candy("B", 3, 0, true);
        Candy candy3 = new Candy("C", 5, 5, false);
        Candy candy4 = new Candy("D", 7, 3, true);
        Candy candy5 = new Candy("E", 12, 2, false);

        candies.addAll(Arrays.asList(candy1, candy2, candy3, candy4, candy5));

        for (Candy candy: candies) {
            System.out.println(candy);
        }
    }
}

/*
1. CandiesTask
         1.1 Create a custom class named Candy
                private variables:
                    brand (String), quantity (int), price (double), hasPeanuts (boolean)

                Encapsulate All the private fields
                        (price of candy can not be set to negative)
                        (quantity of candy can not be set to zero or negative)

                Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

                Extra methods:
                    toString():
                        if the price is zero, print "free" instead of 0

        1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy
 */