package com.Sodafactory;

import java.util.ArrayDeque;

public class Conveyor {
    private final ArrayDeque<Bottle> belt = new ArrayDeque<>();

    void load(Bottle b) {
        if (!isOverloaded()) {
            belt.add(b);
        }
        synchronized (this) {
            this.notify();
        }
    }

    Bottle withdraw() {
        return belt.pollLast();
    }

    boolean isEmpty(){
        if (belt.isEmpty()) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return belt.isEmpty();
    }

    boolean isOverloaded() {
        return belt.size() == 50;
    }
}
