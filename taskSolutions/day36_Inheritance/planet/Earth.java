package day36_Inheritance.planet;

public class Earth extends Planet {
    public void setInfo() {
        setName("Earth");
        setMass("5.9736 x 10 24 kg");
        setRadius(" 6,357 km");
        setSurfaceGravity("980.665 cm/s²");
        setSurfaceArea("7.48 x 10 7 km²");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}