package day36_Inheritance.book;

public class AudioBook extends Book {
    public double length;
    public String narrator;

    public void setInfo(String title, String type, String author, double price, double length, String narrator) {
        setInfo(title, type, author, price);
        this.length = length;
        this.narrator = narrator;
    }

    public void listen() {
        System.out.println("Listening to audiobook " + title + " by " + author + " narrated by " + narrator);
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

/*
	3.3 Create a sub class of Book named AudioBook:
			variables:
				title, type, author, price, length, narrator

			Methods:
				setInfo()
				listen()
				toString()
 */