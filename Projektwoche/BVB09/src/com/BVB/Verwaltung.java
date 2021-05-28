package com.BVB;

import java.util.ArrayList;

public class Verwaltung {

    ArrayList<Mitglieder> mitglieder = new ArrayList<>();

    protected void addMitglied(Mitglieder mitglied) {
        mitglieder.add(mitglied);
    }

    protected void printData(){
        mitglieder.forEach(Mitglieder::printData);
    }
}
