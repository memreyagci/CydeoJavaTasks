package day31_Constructors;

import day13_String.CheckWords;
import day31_Constructors.restaurant.Chef;
import day31_Constructors.restaurant.Server;

public class Test {
    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator(5, 4, 3, 18);
        System.out.println(calculator);

        Address address = new Address(0123, 12, "Warsaw", "Mazowieckie", "astreet");
        System.out.println(address);

        Item item = new Item("test", 15, 3);
        System.out.println(item);

        Carpet carpet = new Carpet(5.5, 4.5, 10, true);
        System.out.println(carpet);

        Server server = new Server("test", 34123, 3, false);
        System.out.println(server);

        Chef chef = new Chef("test", 34123, 3, true);
        System.out.println(chef);
    }
}
