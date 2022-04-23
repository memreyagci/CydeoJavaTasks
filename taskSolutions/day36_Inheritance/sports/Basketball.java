package day36_Inheritance.sports;

public class Basketball extends Sports {
    public void setInfo(String rules) {
        setName("Basketball");
        setRules(rules);
        setNumberOfReferee(2);
        setNumberOfPlayers(10);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
