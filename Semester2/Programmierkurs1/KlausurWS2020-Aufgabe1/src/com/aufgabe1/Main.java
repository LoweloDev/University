package com.aufgabe1;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Value[] list = Util.wertetabelle(0, 10, x -> x*x*x);

        Value[] list2 = Util.wertetabelle(0, 10, new Function<Double, Double>() {
            @Override
            public Double apply(Double aDouble) {
                return aDouble*aDouble*aDouble;
            }
        });

        Util.ausgabeFilter(list, x -> x%2==0);
        Util.ausgabeFilter(list2, new Predicate<Double>() {
            @Override
            public boolean test(Double aDouble) {
                return aDouble%2 ==0;
            }
        });
    }
}
