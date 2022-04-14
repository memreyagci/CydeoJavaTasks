package day39_Inheritance_Encapsulation.device;

public class Iphone extends Phone{
    public Iphone(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    public void faceTime(long phoneNum){
        System.out.println(getBrand()+ " " + getModel() + " is face timing " + phoneNum);
    }

    public void faceTime(String email){
        System.out.println(getBrand() + " " + getModel() + " is face timing " + email);
    }
}