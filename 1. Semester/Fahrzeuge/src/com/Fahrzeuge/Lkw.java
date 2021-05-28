package com.Fahrzeuge;

public class Lkw extends Fahrzeug{
    double treibstoffVerbrauchKM = 0.25;
    private static int id = 0;
    public Lkw() {
        super(2, "Diesel");
        id++;
    }

    public double berechneVerbrauchPro100Km() {
        return treibstoffVerbrauchKM * 100;
    }

    @Override
    public String toString(){
        return "Lkw" + id + super.toString();
    }
}
