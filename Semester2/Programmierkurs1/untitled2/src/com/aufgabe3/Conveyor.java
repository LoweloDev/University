package com.aufgabe3;

import java.util.Stack;

public class Conveyor {
    Stack<Bottle> warteschlange;

    public Conveyor() {
        warteschlange = new Stack<>();
    }

    public void add(Bottle bottle) {
        if (!isFull()) {
            warteschlange.push(bottle);
        }
    }

    public Bottle remove() {
        return warteschlange.pop();
    }

    public boolean isEmpty() {
        return warteschlange.isEmpty();
    }

    public boolean isFull() {
        return warteschlange.size() > 50;
    }
}
