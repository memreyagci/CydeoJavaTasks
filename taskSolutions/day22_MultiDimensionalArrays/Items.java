package day22_MultiDimensionalArrays;

public class Items {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (String[] eachGroup : items) {
            for (String eachItem : eachGroup) {
                System.out.print(eachItem + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (String[] eachGroup : items) {
            for (int a = eachGroup.length - 1; a >= 0; a--) {
                System.out.print(eachGroup[a] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = items.length - 1; i >= 0; i--) {
            for (String eachItem : items[i]) {
                System.out.print(eachItem + "\t");
            }
            System.out.println();
        }
    }
}

/*
2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
 */