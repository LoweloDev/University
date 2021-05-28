package com.Bruchrechnung;

public class Bruch {
    private int numerator;
    private int denominator;

    Bruch(int numerator) {
        this.denominator = 1;
        this.numerator = numerator;
    }

    Bruch(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    protected void multiplyBy(int n) {
        this.numerator *= n;
        this.denominator *= n;
    }

    protected void multiplyBy(Bruch b) {
        this.numerator *= b.numerator;
        this.denominator *= b.denominator;
    }

    protected void divideBy(Bruch b) {
        this.numerator *= b.denominator;
        this.denominator *= b.numerator;
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    protected int euclideanGCD(int a, int b) {
        int rest = a % b;
        int factor;

        while (rest > 0 && a - rest >= b) {

            rest = a % b;
            factor = (a - rest) / b;
            a = (a - rest) / factor;
            b = rest;
        }
        return rest;
    }

    protected void reduce() {
        int newmerator = Math.abs(numerator), denewminator = Math.abs(denominator);

        int greatestCommonDivisor = (numerator > denominator) ? euclideanGCD(newmerator, denewminator) : euclideanGCD(denewminator, newmerator);

        if(greatestCommonDivisor != 0) {
            numerator /= greatestCommonDivisor;
            denominator /= greatestCommonDivisor;
        }
    }
}
