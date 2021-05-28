package com.Multiclass;

public class Main {

    public static void main(String[] args) {

        ÖpnvI[] feld = {new Bahn("S1", 100),
                new Bus("A21", 1000),
                new Bahn("R3", 11),
                new Bus("B11", 12)
        };

        for (int i = 0; i < feld.length; i++)
            System.out.println(feld[i]);
    }
}