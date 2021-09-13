package com.aufgabe1;

public class Value {
    double x, y;

    Value(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "x: " + getX() + "y: " + getY();
    }
}
