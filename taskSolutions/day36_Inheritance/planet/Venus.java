package day36_Inheritance.planet;

public class Venus extends Planet {
    public void setInfo() {
        setName("Venus");
        setMass("407,000 km");
        setRadius("1,079.6 mile");
        setSurfaceGravity(" 1.625 m/s²");
        setSurfaceArea("14.6 million mil²");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
