package com.BVB;

abstract class Mitglieder {
    protected String name, vorname;

    Mitglieder(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    protected abstract int jahresgehalt();

    @Override
    public String toString() {
        return name + " | " +  vorname + " | ";
    }

    protected abstract void printData();
}
