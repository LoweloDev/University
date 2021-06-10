package com.Mediaplayer;


import com.Mediaplayer.TemporaryForms.*;

import javax.swing.*;

public class Menu {

    public final static Medienverwaltung mediaplayer = new Medienverwaltung();

    protected void mainMenu() {
        String[] options = {"Add audio file", "Add picture file", "Show media", "Show newest medium", "Medienliste in Datei schreiben", "Save playlist", "Load playlist from file", "Show average release date", "Close"};

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
                mediaplayer.showYoungestMedium();
                mainMenu();
            }
            case 4 -> new FileNamesSaveForm();
            case 5 -> new FileSaveForm();
            case 6 -> new FileLoadForm();
            case 7 -> {
                System.out.println(mediaplayer.avgReleaseDate());
                mainMenu();
            }
        }
    }
}
