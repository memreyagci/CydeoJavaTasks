package day35_Encapsulation;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")) {
            System.err.println("Invalid size: " + size);
            System.exit(1);
        } else {
            this.size = size;
        }
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping < 0) {
            System.err.println("Invalid number of cheese topping: " + numberOfCheeseTopping);
            System.exit(1);
        } else if (size.equalsIgnoreCase("small") && numberOfCheeseTopping > 3) {
            System.err.println("Invalid number of cheese topping: " + numberOfCheeseTopping);
            System.exit(1);
        } else if (size.equalsIgnoreCase("medium") && numberOfCheeseTopping > 4) {
            System.err.println("Invalid number of cheese topping: " + numberOfCheeseTopping);
            System.exit(1);
        } else if (size.equalsIgnoreCase("large") && numberOfCheeseTopping > 5) {
            System.err.println("Invalid number of cheese topping: " + numberOfCheeseTopping);
            System.exit(1);
        } else {
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        }
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (numberOfCheeseTopping < 0) {
            System.err.println("Invalid number of pepperoni topping: " + numberOfPepperoniTopping);
            System.exit(1);
        } else if (size.equalsIgnoreCase("small") && numberOfCheeseTopping > 4) {
            System.err.println("Invalid number of pepperoni topping: " + numberOfPepperoniTopping);
            System.exit(1);
        } else if (size.equalsIgnoreCase("medium") && numberOfCheeseTopping > 5) {
            System.err.println("Invalid number of pepperoni topping: " + numberOfPepperoniTopping);
            System.exit(1);
        } else if (size.equalsIgnoreCase("large") && numberOfCheeseTopping > 6) {
            System.err.println("Invalid number of pepperoni topping: " + numberOfPepperoniTopping);
            System.exit(1);
        } else {
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }
    }

    public double calcCost() {
        int toppingPrice = 2 * (numberOfPepperoniTopping + numberOfCheeseTopping);
        int sizePrice = 0;

        if (size.equalsIgnoreCase("small")) {
            sizePrice = 10;
        } else if (size.equalsIgnoreCase("medium")) {
            sizePrice = 12;
        } else if (size.equalsIgnoreCase("medium")) {
            sizePrice = 14;
        }
        return sizePrice + toppingPrice;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", cost=" + calcCost() +
                '}';
    }
}

/*
5. Pizza Task:
		5.1 Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping

				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive

							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5

							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

										small: 4
										medium: 5
										large: 6

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)


				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */