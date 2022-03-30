package day31_Constructors.restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Michael", "UK", 4);

        Server[] servers = {
                new Server("Ahmad", 12, 12, false),
                new Server("Mateusz", 14, 13, false),
                new Server("Olga", 23, 17, true),
        };

        Chef[] chefs = {
                new Chef("Berk", 21, 18, false),
                new Chef("Emily", 20, 21, true),
                new Chef("Burak", 18, 25, true),
        };

        restaurant.hireServer(servers);
        restaurant.hireChef(chefs);

        System.out.println(restaurant);
    }
}

/*
		6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */