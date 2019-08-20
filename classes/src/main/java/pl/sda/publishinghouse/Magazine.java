package pl.sda.publishinghouse;

public class Magazine extends Publication {

    private static final String DEFAULT_AUTHOR = "Redaktor Naczelny";

    public Magazine(String author, int year, int price) {
        super(author, year, price);
    }

    @Override
    public String downloadUrl() {
        return "brak linka";
    }

    @Override
    public String getAuthor() {
        String author = super.getAuthor();

        if (author.equals("nieznany")) {
            return DEFAULT_AUTHOR;
        } else {
            return author;
        }
    }
}


