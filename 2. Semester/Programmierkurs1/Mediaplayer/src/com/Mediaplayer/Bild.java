package com.Mediaplayer;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Objects;

public class Bild extends Medium {
    protected String location;

    public Bild(String location, String title, int year) {
        super(title, year);
        this.location = location;
    }


    protected void printData() {
         System.out.printf("ID = %s, Title: %s, Location: %s, Year: %s\n", getId(), title, location, year);
    }

    protected void printData(OutputStream streamType) {
        PrintStream stream = new PrintStream(streamType);
        stream.printf("ID = %s, Title: %s, Location: %s, Year: %s\n", getId(), title, location, year);
        stream.close();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        if (o instanceof Bild) {
            Bild bild = (Bild) o;
            if (location.equals(bild.location) && title.equals(bild.title) && year == bild.year)
                return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, title, year);
    }
}
