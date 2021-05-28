package com.Mediaplayer;

import java.util.ArrayList;
import java.util.Comparator;

public class Medienverwaltung {

    ArrayList<Medium> mediums = new ArrayList<>();

    protected void addMedium(Medium medium) {
        mediums.add(medium);
    }

    protected void showMediums() {
        mediums.sort(Comparator.comparingInt(item -> item.year));
        mediums.forEach(Medium::printData);
    }

    protected void showNewestMedium() {
        int releaseDate = 0;
        for (Medium medium : mediums) {
            if (releaseDate < medium.year) releaseDate = medium.year;
        }
        for (Medium medium : mediums) {
            if (medium.year == releaseDate) medium.printData();
        }
    }


    protected double avgReleaseDate() {
        double avgReleaseDate = 0;
        for (Medium medium : mediums) {
            avgReleaseDate += medium.year;
        }

        return avgReleaseDate / mediums.size();
    }
}
