package com.BVB;

class Arzt extends Mitglieder{
    protected String fachgebiet;

    Arzt(String name, String vorname, String fachgebiet){
        super(name, vorname);
        this.fachgebiet = fachgebiet;
    }

    protected int jahresgehalt() {
        return 15000 * 12;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " | " + super.toString() + "Fachgebiet: " + fachgebiet;
    }

    protected void printData(){
        System.out.println(this);
    }
}
