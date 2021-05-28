package com.Mozzarella;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Long> fiboghettiSequence(int n) {
        ArrayList<Long> fiboSequence = new ArrayList<>();
        fiboSequence.add(0, 0L);
        fiboSequence.add(1, 1L);

        for(int count = 2; count <= n; count++) {
            long result = fiboSequence.get(count - 1) + fiboSequence.get(count - 2);
            fiboSequence.add(result);
        }

        return fiboSequence;
    }

    // braucht ages bei n = 100 bereits. Kp warum grad muss noch den mathematischen Part von VL02 nachholen. Guess die Laufzeit steigt exponentiell an.

    public static long recursiveFiboghettiSequence(int n) {
        assert(n >= 0);

        if(n > 0)
            return Math.abs(recursiveFiboghettiSequence(n - 1) + recursiveFiboghettiSequence(n - 2));

        return n;
    }


    public static long fibRekursivAufgabe5(int grenze, long fib1, long fib2)
    {
        if (grenze <= 1)
            return fib2;
        return fibRekursivAufgabe5(grenze - 1, fib2, fib1 + fib2);
    }

    public static void main(String[] args) {

        StopUhr stopwatch = new StopUhr();
        int n = 40;

        stopwatch.start();
        fiboghettiSequence(n);
        stopwatch.stop();
        System.out.printf("Decent non-recursive Version time with entire sequence saved and returned: %s ms", (double) stopwatch.getDuration() / 1000000);

        // Wenns zu lange dauert einfach auskommentieren halt
        stopwatch.start();
        recursiveFiboghettiSequence(n);
        stopwatch.stop();
        System.out.printf("\nRecursion time with zero usability and only last number of sequence: %s ms", (double) stopwatch.getDuration() / 1000000);


        stopwatch.start();
        fibRekursivAufgabe5(40, 0 ,1 );
        stopwatch.stop();
        System.out.printf("\nRecursion time (Aufgabe 5) with zero usability and only last number of sequence: %s ms", (double) stopwatch.getDuration() / 1000000);
    }
}
