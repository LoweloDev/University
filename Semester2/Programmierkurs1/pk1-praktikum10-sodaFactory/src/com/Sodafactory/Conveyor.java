package com.Sodafactory;

import java.util.ArrayDeque;

public class Conveyor {
    private final ArrayDeque<Bottle> belt = new ArrayDeque<>();

    void load(Bottle b) {
        if (!isOverloaded()) {
            getBelt().add(b);
        }
        synchronized (this) {
            this.notify();
        }
    }

    Bottle withdraw() {
        return getBelt().pollLast();
    }

    boolean isEmpty(){
        if (getBelt().isEmpty()) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return getBelt().isEmpty();
    }

    boolean isOverloaded() {
        return getBelt().size() == 50;
    }

    ArrayDeque<Bottle> getBelt() {
        return belt;
    }
}
