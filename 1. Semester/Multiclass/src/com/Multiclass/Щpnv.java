package com.Multiclass;

public abstract class Öpnv implements ÖpnvI {
     private static int n = 0;
     private int id;
     private String name;
     private int km;

    protected Öpnv(String name, int km){
        n++;
        id = n;
        this.name = name;
        this.km = km;
    }

     private double berechnePreis() {
        return km*getPreisProKm();
    }
    
    @Override
    public String toString(){
        return name + "(id "+ id +") kostet auf "+ km + "km " + berechnePreis()+" Euro" ;
    }
}
