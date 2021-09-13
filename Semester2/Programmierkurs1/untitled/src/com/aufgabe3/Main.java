package com.aufgabe3;

public class Main {

    public static void main(String[] args) {
        Value[] values = Util.wertetabelle(0, 10, x -> x*x*x);

        Util.ausgabeFilter(values, x -> x%2 == 0);
    }
}
