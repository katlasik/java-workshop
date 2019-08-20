package pl.sda.publishinghouse;

public class Book extends Publication {
    private final boolean isHardcover;

    public Book(String author, int year, int price, boolean isHardcover) {
        super(author, year, price);
        this.isHardcover = isHardcover;
    }

    @Override
    public int getPrice() {
        int price = super.getPrice();

        if (isHardcover) {
            return price * 2;
        } else {
            return price;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "isHardcover=" + isHardcover +
                "year= " + getYear() +
                '}';
    }

    @Override
    public String downloadUrl() {
        return "brak linka";
    }
}
