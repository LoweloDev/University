package com.company;

public class Dozent {

    String name, lehrgebiet;
    char geschlecht;
    Boolean dekan = false;

    Dozent(String name, String lehrgebiet, char geschlecht) {

        this.name = name;
        this.lehrgebiet = lehrgebiet;
        this.geschlecht = geschlecht;
    }

    void setName(String name){

        this.name = name;
    }

    void setLehrgebiet(String lehrgebiet) {

        this.lehrgebiet = lehrgebiet;
    }

    void setDekan(Boolean dekan) {

        this.dekan = dekan;
    }

    void setGeschlecht(char geschlecht) {

        this.geschlecht = geschlecht;
    }

    String getName() {

        return this.name;
    }

    String getLehrgebiet() {

        return this.lehrgebiet;
    }

    Boolean isDekan() {

        return this.dekan;
    }

    char getGeschlecht() {

        return this.geschlecht;
    }

}

