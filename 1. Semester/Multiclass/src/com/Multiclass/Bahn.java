package com.Multiclass;

public class Bahn extends Öpnv {
    Bahn(String name, int km) {
        super(name, km);
    }

    public double getPreisProKm() {
        return 0.1;
    }

    @Override
    public String toString(){
        return "Bahn " + super.toString();
    }
}
