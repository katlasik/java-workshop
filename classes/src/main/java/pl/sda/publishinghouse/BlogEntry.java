package pl.sda.publishinghouse;

public class BlogEntry extends Publication {

    private String url;

    public BlogEntry(String author, int year, int price, String url) {
        super(author, year, price);
        this.url = url;
    }

    @Override
    public int getPrice() {
        return 0; //zawsze zwracam 0
    }

    @Override
    public String downloadUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "BlogEntry{" +
                "url='" + url + '\'' +
                "year= " + getYear() +
                '}';
    }
}
