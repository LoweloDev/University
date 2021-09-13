package com.aufgabe3;

import java.time.LocalDate;

public class Label {
    private final String sorte;
    private final int bestBefore;

    public Label() {
        sorte = "";
        bestBefore = 0;
    }

    public Label(String sorte) {
        this.sorte = sorte;
        bestBefore = LocalDate.now().getYear() + 2;
    }

    public int getBestBefore() {
        return bestBefore;
    }

    public String getSorte() {
        return sorte;
    }
}