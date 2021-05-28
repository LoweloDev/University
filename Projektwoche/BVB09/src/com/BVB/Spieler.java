package com.BVB;

class Spieler extends Mitglieder {
    protected String position;
    protected int einsaetze;

    Spieler(String position, int einsaetze, String name, String vorname) {
        super(name, vorname);
        this.position = position;
        this.einsaetze = einsaetze;
    }

    protected int jahresgehalt() {
        return  250000 * 12 + (einsaetze * 10000);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " | " + super.toString() + "Position: " + position + " / Spieleinsätze: " + einsaetze ;
    }

    protected void printData(){
        System.out.println(this);
    }
}
