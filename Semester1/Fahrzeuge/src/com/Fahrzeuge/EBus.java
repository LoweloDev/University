package com.Fahrzeuge;

public class EBus extends Fahrzeug {
    private static int id = 0;
    public EBus(int anzPersonen){
        super(anzPersonen, null);
        id++;
    }

    public double berechneVerbrauchPro100Km() {
        return 0;
    }

    @Override
    public String toString(){
        return "Ebus " + id + super.toString();
    }
}
