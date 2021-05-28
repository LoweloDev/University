package com.Mediaplayer;


import javax.swing.*;
import java.util.stream.IntStream;
import java.util.Date;

public class Menu {

    final static Medienverwaltung mediaplayer = new Medienverwaltung();

    protected void mainMenu() {
        String[] options = {"Add audio file", "Add picture file", "Show media", "Show newest medium", "Show average release date", "Close"};

        int menu = JOptionPane.showOptionDialog(null, "Main Menu",
                "Click a button", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        switch (menu) {
            case 0 -> new AudioForm();
            case 1 -> new PictureForm();
            case 2 -> {
                mediaplayer.showMediums();
                mainMenu();
            }
            case 3 -> {
                mediaplayer.showNewestMedium();
                mainMenu();
            }
            case 4 -> {
                System.out.println(mediaplayer.avgReleaseDate());
                mainMenu();
            }
        }
    }
}
