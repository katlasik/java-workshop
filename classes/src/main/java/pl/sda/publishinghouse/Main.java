package pl.sda.publishinghouse;

public class Main {

    public static void main(String[] args) {
        PublishingHouse pwn = new PublishingHouse("PWN");

        Book wPustyniIWPuszczy = new Book("Sienkiewicz", 1500, 2, true);
        Ebook jakStraticNaBitcoinach = new Ebook("Sienkiewicz", 20, 1, "http://jakstracic.pl");
        Magazine dlaczegoJa = new Magazine("Jerzy", 2019, 3);
        BlogEntry jakNaprawicSamochod = new BlogEntry(
                "Sienkiewicz",
                2100,
                1,
                "http://naprawianie-samochodu.pl");

        pwn.addPublications(
                wPustyniIWPuszczy,
                jakStraticNaBitcoinach,
                dlaczegoJa,
                jakNaprawicSamochod
        );

        System.out.println("Liczba publikacji:");
        System.out.println(pwn.getPublicationCount());
        System.out.println("Średnia cena:");
        System.out.println(pwn.avgPrice());
        System.out.println("Lista linków:");
        System.out.println(pwn.downloadUrls());
        System.out.println("Lista publikacji według roku:");
        System.out.println(pwn.getPublicationList());


        PublishingHouse helion = new PublishingHouse("Helion");

        helion.addPublication(new Ebook("Kowalski", 2019, 0, "http://ebook.pl"));

        System.out.println(helion.getPublicationCount());

    }

}
