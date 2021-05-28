package com.company;

import java.util.Scanner;

public class Main {

    static double can_circumfence(double radius){

        double circumfence = 2 * Math.PI * radius;

        return circumfence;
    }

    static double can_cover(double radius){

        double cover = Math.PI * Math.pow(radius, 2);

        return cover;
    }

    static double can_lateral_surface(double circumfence, double height){

        double lateral_surface = circumfence * height;

        return lateral_surface;
    }

    static double can_surface(double cover, double lateral_surface){

        double surface = 2 * cover + lateral_surface;

        return surface;
    }

    static double can_volume(double cover, double height){

        double volume = cover * height;

        return volume;
    }

    public static void main(String[] args) {

        Scanner inputVal = new Scanner(System.in);

        System.out.println("Senden Sie nacheinander Radius und Höhe als Ganze, oder Gleitpunktzahlen, ohne Einheitssymbol.");

        double radius, height, circumfence, cover, lateral_surface, surface, volume;
        radius = inputVal.nextDouble();
        height = inputVal.nextDouble();

        // Im Folgenden werden die Methoden genau EIN mal gecalled und die returnvalues gespeichert und auch weitergegeben falls benötigt.
        // So spare ich mir in jeder Methode (wie bspw surface) Methoden neu aufzurufen/berechnen zu lassen.

        // Zusammengefasst spare ich mir meiner Ansicht nach unnötige Redundanzen

        circumfence = can_circumfence(radius);
        cover = can_cover(radius);
        lateral_surface = can_lateral_surface(circumfence, height);
        surface = can_surface(cover, lateral_surface);
        volume = can_volume(cover, height);

        System.out.printf("Umfang: %s \nDeckelfläche: %s \nMantelfläche: %s \nOberfläche: %s \nVolumen: %s", circumfence, cover, lateral_surface, surface, volume);
    }


}
