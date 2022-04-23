package day36_Inheritance.sports;

public class Baseball extends Sports {
    public void setInfo(String rules) {
        setName("Baseball");
        setRules(rules);
        setNumberOfReferee(4);
        setNumberOfPlayers(18);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
