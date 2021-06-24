package com.Multiclass;

public class Bus extends Öpnv {
    Bus(String name, int km) {
        super(name, km);
    }

    public double getPreisProKm() {
        return 0.05;
    }

    @Override
    public String toString(){
        return "Bus " + super.toString();
    }
}
