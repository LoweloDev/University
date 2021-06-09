package com.Mediaplayer;

import java.io.*;
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

    public void writeMediums(String name) {
            mediums.forEach(Medium -> {
                try (FileOutputStream out = new FileOutputStream(name, true)) {
                    Medium.printData(out);
                } catch (IOException IOe) {
                    IOe.printStackTrace();
                }
            });
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

    //Better would be using Files class and "copy()" method
    public static void copy(File from, File to) {
        RandomAccessFile rFileFrom;
        RandomAccessFile rFileTo;
        try {
            rFileFrom = new RandomAccessFile(from, "r");
            rFileTo = new RandomAccessFile(to, "rw");
            for (int i = 0; i < rFileFrom.length(); i++) {
                rFileTo.write(rFileFrom.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
