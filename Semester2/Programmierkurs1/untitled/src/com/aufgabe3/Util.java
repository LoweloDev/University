package com.aufgabe3;

import java.util.Arrays;
import java.util.List;

public class Util {
    static Value[] wertetabelle (double von, int n, java.util.function.Function<Double,Double> f) {
        if ( n < 1) {
            throw new IllegalArgumentException();
        }

        Value[] values = new Value[n];

        for(int i = 0; i < n; i++) {
            values[i] = new Value(von+i, f.apply(von+i));
        }

        return values;
    }

    static void ausgabeFilter(Value[] values, java.util.function.Predicate<Double> p) {
        List<Value> valList = Arrays.stream(values).toList();

        valList.stream().filter(value -> p.test(value.getX())).forEach(System.out::println);
    }
}
