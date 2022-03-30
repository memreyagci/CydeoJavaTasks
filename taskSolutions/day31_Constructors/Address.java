package day31_Constructors;

public class Address {
    public int buildingNumber, zipCode;
    public String city, state, street;

    public Address(int buildingNumber, int zipCode, String city, String state, String street) {
        this.buildingNumber = buildingNumber;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
        this.street = street;
    }

    @Override
    public String toString() {
        return buildingNumber + " " + street + "\n" + city + " " + state + ", " + zipCode;
    }
}

/*
2. Address Task:
	2.1 Create a class named Address
		    Attributes:
		         buildingNumber, street, city, state, zipCode;

		   	Add a constructor to set all the fields

		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012
 */