package day36_Inheritance.sports;

public class AmericanFootball extends Sports {
    public void setInfo(String rules) {
        setName("American Football");
        setRules(rules);
        setNumberOfReferee(7);
        setNumberOfPlayers(53);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
