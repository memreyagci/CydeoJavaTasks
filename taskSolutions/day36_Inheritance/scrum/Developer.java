package day36_Inheritance.scrum;

public class Developer extends Employee {
    public void fixBugs(){
        System.out.println(getName() + " is fixing bugs.");
    }
}