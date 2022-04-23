package day36_Inheritance.sports;

public class Football extends Sports {
    public void setInfo(String rules) {
        setName("Football");
        setRules(rules);
        setNumberOfReferee(7);
        setNumberOfPlayers(22);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}