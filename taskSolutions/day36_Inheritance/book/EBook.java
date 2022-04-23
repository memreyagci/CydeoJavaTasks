package day36_Inheritance.book;

public class EBook extends Book {
    public double size;
    public int pages;

    public void setInfo(String title, String type, String author, double price, double size, int pages) {
        setInfo(title, type, author, price);
        this.size = size;
        this.pages = pages;
    }

    public void readBook() {
        System.out.println("Reading the book " + title + " by " + author);
    }

    @Override
    public String toString() {
        return "EBook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", pages=" + pages +
                '}';
    }
}

/*
	3.2 Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size, pages

			Methods:
				setInfo()
				readBook()
				toString()
 */