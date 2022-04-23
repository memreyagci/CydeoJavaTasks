package day36_Inheritance.phone;

public class Phone {
    public String brand, model, color;
    public double size, price;

    public void setInfo(String model, double size, double price, String color) {
        brand = getClass().getSimpleName();
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void call(long phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("Texting to "+phoneNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +  // this gets the class name automatically
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

/*
1. Phone Task:
		1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */