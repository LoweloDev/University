package com.aufgabe1;

import java.util.Arrays;
import java.util.List;

public class Util {
    static Value[] wertetabelle (double von, int n,
                                 java.util.function.Function<Double, Double> f) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }
        Value[] toupleList = new Value[n];
        for (int i = 0; i < n; i++){
            toupleList[i] = new Value(von + i, f.apply(von + i));
        }
        return toupleList;
    }

    public static void ausgabeFilter(Value[] values,
                              java.util.function.Predicate<Double> p) {
        List<Value> valueList = Arrays.asList(values);
        valueList.stream().filter((x) -> p.test(x.getX())).forEach(System.out::println);

        // Solution 2
        // Arrays.stream(values).toList().stream().filter( value -> p.test(value.getX())).forEach(System.out::println);
    }
}
