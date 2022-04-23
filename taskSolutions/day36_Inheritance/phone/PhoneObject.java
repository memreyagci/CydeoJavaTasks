package day36_Inheritance.phone;

public class PhoneObject {
    public static void main(String[] args) {
        Nokia nokia3310 = new Nokia();
        nokia3310.setInfo("3310", 5, 100, "grey");
        nokia3310.selfDefence();

        Samsung galaxyFold = new Samsung();
        galaxyFold.setInfo("Galaxy Fold", 12, 2000, "black");
        galaxyFold.freeze();
        galaxyFold.call(123456789);
        galaxyFold.text(123456789);

        IPhone _12 = new IPhone();
        _12.setInfo("12", 6, 1500, "gold");
        _12.faceTime("test@test.com");
        _12.faceTime(123456789);

        System.out.println(_12);
        System.out.println(galaxyFold);
        System.out.println(nokia3310);

    }
}

/*
		1.5 Create a class named Phone Objects and test of the sub class' objects
 */