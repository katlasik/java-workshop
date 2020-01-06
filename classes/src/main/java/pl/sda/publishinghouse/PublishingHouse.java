package pl.sda.publishinghouse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PublishingHouse {

    private String name;
    private ArrayList<Publication> publicationList = new ArrayList<>();

    public PublishingHouse(String name) {
        this.name = name;
    }

    void addPublication(Publication zmienna) {
        publicationList.add(zmienna);
    }

    void addPublications(Publication... zmienna) {
        publicationList.addAll(Arrays.asList(zmienna));
    }

    int getPublicationCount() {
        return publicationList.size();
    }

    double avgPrice() {
        int sum = 0;
        for (Publication p : publicationList) {
            sum += p.getPrice();
        }

        return ((double) sum) / publicationList.size();
    }

    ArrayList<String> downloadUrls() {

        ArrayList<String> linki = new ArrayList<>();

        for (Publication d : publicationList) {
            linki.add(d.downloadUrl());
        }

        return linki;
    }

    public ArrayList<Publication> getPublicationList() {
        Collections.sort(publicationList);
        return publicationList;
    }

    public String getName() {
        return name;
    }
}
