package com.Fahrzeuge;

public class Pkw extends Fahrzeug {
    double treibstoffVerbrauchKM = 0.05;
    private static int id = 0;
    Pkw(int anzahlPersonen) {
        super(anzahlPersonen, "Benzin");
        id++;
    }

    public double berechneVerbrauchPro100Km() {
        return treibstoffVerbrauchKM * 100;
    }

    @Override
    public String toString(){
        return "LKW" + id + super.toString();
    }
}
