package pl.sda.publishinghouse;

abstract public class Publication implements Downloadable, Comparable<Publication> {

    private String author;
    private int year;
    private int price;

    public Publication(String author, int year, int price) {
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public Publication(int year, int price) {
        this("nieznany", year, price); //wywołuję pierwszy konstruktor
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Publication o) {
        return Integer.compare(this.year, o.year);
    }
}


