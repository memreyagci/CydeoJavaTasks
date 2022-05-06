package day44_Abstraction.device;

public class DeviceShop {
    public static void main(String[] args) {
        Google google = new Google("Google", "4a", "5.8\"", true, true, "black", 450);
        google.toString();
        google.turnOn();
        google.downloadApp();
        google.call(123456789);
        google.text(123456789);
        google.turnOff();

        Iphone iphone = new Iphone("Iphone", "13", "6.2\"", true, true, "gold", 1100);
        iphone.toString();
        iphone.turnOn();
        iphone.downloadApp();
        iphone.call(123456789);
        iphone.text(123456789);
        iphone.turnOff();

        Samsung samsung = new Samsung("Samsung", "S11", "6.5\"", true, true, "white", 1100);
        samsung.toString();
        samsung.turnOn();
        samsung.downloadApp();
        samsung.call(123456789);
        samsung.text(123456789);
        samsung.turnOff();

        Laptop laptop = new Laptop("Lenovo", "X1 Carbon", "14\"", true, true, "black", 600);
        laptop.toString();
        laptop.turnOn();
        laptop.turnOff();

        Desktop desktop = new Desktop("HP", "X5000", "23\"", false, true, "white", 3000);
        desktop.toString();
        desktop.turnOn();
        desktop.turnOff();

        PersonalComputer personalComputer = new PersonalComputer("Macbook", "Pro", "13\"", true, true, "silver", 2300);
        personalComputer.toString();
        personalComputer.turnOn();
        personalComputer.turnOff();
    }

}
