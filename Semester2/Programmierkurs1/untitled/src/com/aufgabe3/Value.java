package com.aufgabe3;

public class Value {
    double x, y;

    Value(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    @Override
    public String toString() {
        return "" + x + "" +  y;
    }
}
