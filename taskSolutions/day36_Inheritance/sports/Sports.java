package day36_Inheritance.sports;

public class Sports {
    private String name, rules;
    private int numberOfReferee, numberOfPlayers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public void setNumberOfReferee(int numberOfReferee) {
        this.numberOfReferee = numberOfReferee;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void setInfo(String name, String rules, int numberOfReferee, int numberOfPlayers) {
        setName(name);
        setRules(rules);
        setNumberOfReferee(numberOfReferee);
        setNumberOfPlayers(numberOfPlayers);
    }

    public void play() {
        System.out.println(numberOfPlayers + " players are playing " + name + " with " + numberOfReferee + " refereed implementing the following rules: " + rules);
    }

    @Override
    public String toString() {
        return "Sports{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfReferee=" + numberOfReferee +
                ", numberOfPlayers=" + numberOfPlayers +
                '}';
    }
}

/*
Sports Task:
	1. Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfReferre, rules

			methods:
				setInfo()
				play()
				toString()

		2. create the following sub classes of Sport:
				1. Basketball
				2. Baseball
				3. Football
				4. AmericanFootball

			Add any missing variables or methods

			Note: you can search them on google
 */