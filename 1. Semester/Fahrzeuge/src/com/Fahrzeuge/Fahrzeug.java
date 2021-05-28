package com.Fahrzeuge;

public abstract class Fahrzeug {
    private int anzPersonen;
    private String treibstoffArt;
    public Fahrzeug(int anzPersonen, String treibstoffArt)
    {
        this.anzPersonen = anzPersonen;
        this.treibstoffArt = treibstoffArt;
    }
    public abstract double berechneVerbrauchPro100Km();
    protected double kmProLiter() {
        return 100/berechneVerbrauchPro100Km();
    }
    public String toString() {
        return "tankt " + treibstoffArt + " für "
                + anzPersonen + " Personen, ";
    }
    public static void main(String[] args)
    {
        Lkw brummiA = new Lkw();
        Lkw brummiB = new Lkw();
        EBus oekoA = new EBus(41);
        EBus oekoB = new EBus(39);
        EBus oekoC = new EBus(41);
        Pkw taxi = new Pkw(5);

        System.out.println("" + brummiA + brummiA.kmProLiter());
        System.out.println("" + brummiB + brummiB.kmProLiter());
        System.out.println("" + oekoA + oekoA.kmProLiter());
        System.out.println("" + oekoB + oekoB.kmProLiter());
        System.out.println("" + oekoC + oekoC.kmProLiter());
        System.out.println("" + taxi + taxi.kmProLiter());
    }
}