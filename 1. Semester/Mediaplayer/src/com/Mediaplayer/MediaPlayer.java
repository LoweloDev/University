package com.Mediaplayer;

public class MediaPlayer {
    int freierSpeicher;
    Medium[] medien = new Medium[1000];

    MediaPlayer(int speicherkapazität){
        this.freierSpeicher = speicherkapazität;
    }

    int getFreierSpeicher(){
        return freierSpeicher;
    }

    int getAnzahlMedien(){
        int anzahl = 0;
        for (Medium medium : medien) if (medium != null) anzahl++;

        return anzahl;
    }

    int addMedium(Medium medium){
        int index = -1;
        if(freierSpeicher > medium.berechneSpeicherverbrauch()){
            for(int medienIndex = 0; medienIndex < medien.length; medienIndex++){
                if(medien[medienIndex] == null) {
                    medien[medienIndex] = medium;
                    index = medienIndex;
                    freierSpeicher -= medium.berechneSpeicherverbrauch();
                }
            }
        }
        return index;
    }

    Medium removeMedium(String name){
        Medium medium = null;
        for(int medienIndex = 0; medienIndex < medien.length; medienIndex++){
            if(medien[medienIndex].name.equals(name)) {
                medien[medienIndex] = null;
                medium = medien[medienIndex];
            }
        }
        return medium;
    }

    public static void main(String[] args) {
	// write your code here
        MediaPlayer x = new MediaPlayer(50);

    }
}
