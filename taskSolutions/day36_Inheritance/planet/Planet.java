package day36_Inheritance.planet;

public class Planet {
    private String name, mass, radius, surfaceGravity, surfaceArea;

    public void setName(String name) {
        this.name = name;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public void setSurfaceGravity(String surfaceGravity) {
        this.surfaceGravity = surfaceGravity;
    }

    public void setSurfaceArea(String surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public void setInfo(String name, String mass, String radius, String surfaceGravity, String surfaceArea) {
        setName(name);
        setMass(mass);
        setRadius(radius);
        setSurfaceGravity(surfaceGravity);
        setSurfaceArea(surfaceArea);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", surfaceGravity=" + surfaceGravity +
                ", surfaceArea=" + surfaceArea +
                '}';
    }
}

/*
Planet Task:
	1. create a class called Planet
			variables:
					name, mass, radius, surfaceGravity, surfaceArea, volume, population

			methods:
				setInfo()
				toString()

	2. create the following subclasses of Planet
			1. Earth
			2. Moon
			3. Mercury
			4. Venus

			Note: you can search them on google
 */