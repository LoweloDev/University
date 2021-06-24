package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputVal = new Scanner(System.in);

        final int x = inputVal.nextInt();
        // int wäre hier zwar Speichereffizienter, aber dieser Speicherunterschied ist idR irrelevant
        // daher Clean Code > Effizienz, somit double und Math.pow()
        double fx = 5 * x;
        final double px = fx + 3 * Math.pow(x, 2);

        fx = px + Math.pow(x, 3);

        System.out.println(fx);
    }
}