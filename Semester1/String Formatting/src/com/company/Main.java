package com.company;

// Sorry wegen letztem Praktikum, Aufgabe 4 nicht richtig gelesen. Falls die selbe Person korrigiert:
// Warum die Variablen String student_name + Sanner inputVal nicht final? Die Werte beider Variablen sollten unabhängig von der Aufgabenstellung konstant sein.
// Spätestens wenn mat_number konstant sein soll. Denn eine konstante mat_number weist auf die Daten von nur einer einzelnen Person hin, pro Verarbeitung/Ausführung.
// Ich frage weil ich mir nur ungerne etwas angewöhnen möchte, was ich später bereue.


//Aufgabe 5 a) Invalid:

/* System.out.println("Hello									// wrong formatting. A string is a chain of characters. The chain is broken in this example.
    World");*/

// System.out.println(""");									    // " is reserved for initiating Strings if you want to print it you have to use the escape character \ -> \".

// System.out.println(0xFG);                                    // Hexadecimal: 0-9, A-F. -> Error

// System.out.println("Zahl " + 0,344e-17f ); 					// , divides elements/tokens. When you want to print these exact values you have to use String formatting,
                                                                // e.g. System.out.printf("Zahl 1: %s, Zahl 2: %s", 0, 344e-17f ) or System.out.printf("Zahl" + "x: %s y: %s", 0, 344e-17f);
                                                                // or replace , with . and have a valid print of 0.344e-17f


//Aufgabe 5 b) Valid:

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello" + "\n -> Simple String printed in the same line don't know what to explain \n");
        System.out.println(" World" + "\n -> Simple String printed in a new line with println()");
        System.out.println("4*5" + "\n -> another Simple String");
        System.out.println(4*5 + "\n -> Arithmetic operation 4 multiplied with 5");
        System.out.println("Dies ist" + "ein Text" + "\n -> String interpolation");
        System.out.println("Dies ist"
                + "ein Text" + "\n -> String interpolation, can be multi-line since it doesn't violate any rules, but it potentially causes eye cancer.");
        System.out.println("Dies ist ein \nText" + "\n ->\\n is breaking the line and starting a new one");
        System.out.println("\u0065" + "\n -> Unicode character 65 Unicode table -> e");
        System.out.println("\"" + "\n -> double quotes printed via escape character \\");
        System.out.println(2147483647 + "\n -> Integer.MAX_VALUE");
        System.out.println(2147483647+1 + "\n -> Integer can overflow. Integer.MAX_VALUE + 1 results in Integer.MIN_VALUE.");
        System.out.println(0xFF + "\n -> Hexadecimal value for 8bit/1Byte -> 255");
        System.out.println(0xFFFF + "\n -> Hexadecimal value for 16 Bit/2Byte -> 65.535");
        System.out.println(0xFFFFFF + "\n -> Hexadecimal value for 24 Bit/3Byte -> 16.777.215");
        System.out.println(0xFFFFFFFF + "\n -> Hexadecimal value for 32-Bit/4Byte -> exceeds Integer.MAX_VALUE by exactly |Integer.MIN_VALUE| \n -> Integer overflow (Integer.MAX_VALUE + |Integer.MIN_VALUE| -> -1. Because |Integer.MIN_VALUE| = |Integer.MAX_VALUE| + 1 and Integer.MAX_VALUE + 1 = Integer.MIN_VALUE. \n -> Must be long to be displayed properly. -> 0xFFFFFFFFl");
        System.out.println(0.344e-17f + "\n -> double x = Math.nextUp(0.344 * Math.pow(10, -17)); or just in math where '^' wouldn't work in code since it's XOR -> 0.344 * 10^(-17)");
        System.out.println("Zahl " + 0.12345678901234567890 + "\n -> Dobule precision is 15.95 digits, or in this case decimal digits due to 0 \n -> resulting in 17 digits here, where the 16. digit is correct due to the precision of 15.95 instead of flat out 15. The 17. digit is rounded up, the rest is cut off.");
        System.out.println("Zahl " + 0.12345678901234567890f + "\n -> Float precision is about 6.92 digits, or in this case, decimal digits due to 0 -> resulting in 8 digits here, where the last one is rounded and the rest is cut off.");
        System.out.println("Summe " + (5.6 + 5.8) + "\n -> 11.3999..., because neither 5.6 nor 5.8 are the most accurate representations of the decimal values 5.8 and 5.6 in Double");
        System.out.println("Summe " + (12345678.0f + 0.1f) + "\n -> Float precision 6.92 digits exceeded -> sum 12345678.1f rounded -> 1.2345678E7 (-> >= 10^7 -> scientific notation)");
        System.out.println("Differenz " + (0.123456789f - 0.123456788f) + "\n -> Float precision 6.92 digits exceeded -> both rounded to 0.12345679f -> subtraction -> 0" );
        System.out.println("Summe " + ((12345678.0f + 0.1f) + 0.41f) + "\n -> Float precision 6.92 digits exceeded -> sum 12345678.1f rounded -> sum 12345678.41f rounded -> 1.2345678E7 (-> >= 10^7 -> scientific notation); \n -> This happens because the operation in the first parentheses is calculated first, and to the result 0.41f is added.");
        System.out.println("Summe " + (12345678.0f + (0.1f + 0.41f)) + "\n -> Float precision 6.92 digits exceeded -> sum 12345678.51f rounded -> 1.2345679E7 (-> >= 10^7 -> scientific notation)");
    }
}
