package pl.sda.publishinghouse;

public class Ebook extends Publication {
    private String url;

    public Ebook(String author, int year, int price, String url) {
        super(author, year, price);
        this.url = url;
    }

    @Override
    public String downloadUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Ebook{" +
                "url='" + url + '\'' +
                "year= " + getYear() +
                '}';
    }
}
