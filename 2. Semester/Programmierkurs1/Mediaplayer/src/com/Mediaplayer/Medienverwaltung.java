package com.Mediaplayer;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Comparator;

public class Medienverwaltung {

    ArrayList<Medium> mediums = new ArrayList<>();

    public void addMedium(Medium medium) {
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

    public static void copy(File from, File to) {
        try {
            RandomAccessFile rFileFrom = new RandomAccessFile(from, "r");
            RandomAccessFile rFileTo = new RandomAccessFile(to, "rw");
            for (int i = 0; i < rFileFrom.length(); i++) {
                rFileTo.write(rFileFrom.read());
            }
            rFileFrom.close();
            rFileTo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
