package com.company;

import java.net.URI;

public class Main {

    public static void main(String[] args) {

        Dozent derDekan = new Dozent("Gabba Gandalf", "5000 Watt Bassmachine", 'M');

        derDekan.setDekan(true);

        Dozent einDozent = new Dozent("Aragon, der Gärtner", "Alkoholiker", 'M');


        System.out.printf("Name: %s, Geschlecht: %s, Lehrgebiet: %s, Ist Dekan?: %s", derDekan.getName(), derDekan.getGeschlecht(), derDekan.getLehrgebiet(), derDekan.isDekan());

        einDozent.setLehrgebiet("Reiseführer nach Mordor");

        try {
            URI uri= new URI("http://deinemutterdenktsiewaereeinhobbitundheisstfrodo.de/");

            java.awt.Desktop.getDesktop().browse(uri);
            System.out.println("\nEin bisschen Spaß muss sein, Freunde der Nachtsonne.");
        }

        catch (Exception e) {

            e.printStackTrace();
        }
    }
}
