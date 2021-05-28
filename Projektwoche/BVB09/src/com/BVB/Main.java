package com.BVB;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Verwaltung verwaltung = new Verwaltung();

        Spieler Spieler = new Spieler("Tor", 16, "Bürki", "Roman");
        Trainer Trainer = new Trainer("Terzic", "Edin", Spieler);
        Arzt Arzt = new Arzt("Braun", "Markus", "Irgendwelche Wissenschaften");

        verwaltung.addMitglied(Spieler);
        verwaltung.addMitglied(Trainer);
        verwaltung.addMitglied(Arzt);

        System.out.println( "Typ | Name | Vorname | Spezielle Eigenschaften");

        verwaltung.printData();
    }
}
