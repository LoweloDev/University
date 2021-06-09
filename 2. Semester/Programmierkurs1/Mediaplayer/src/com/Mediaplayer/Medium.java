package com.Mediaplayer;

import java.io.OutputStream;
import java.time.LocalDate;

public abstract class Medium {

    private static int idGenerator = 0;
    private final int id;
    protected String title;
    protected int year;

    Medium(String title, int year) {
        this.title = title;
        this.year = year;
        this.id = idGenerator;
        idGenerator++;
    }

    protected int age() {
        LocalDate date = LocalDate.now();

        return date.getYear() - year;
    }

    public int getId() {
        return id;
    }

    protected abstract void printData();
    protected abstract void printData(OutputStream stream);

    //TODO Override equals/hashcode generaliztaion in Mediaplayer ?
}