package com.BVB;

class Trainer extends Mitglieder {
    protected Spieler lieblingsspieler;

    Trainer(String name, String vorname, Spieler lieblingsspieler) {
        super(name,vorname);
        this.lieblingsspieler = lieblingsspieler;
    }

    protected int jahresgehalt() {
        return  170000 * 12;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " | " + super.toString() + "Lieblingsspieler: " + lieblingsspieler.name + " " + lieblingsspieler.vorname;
    }

    protected void printData(){
        System.out.println(this);
    }
}
