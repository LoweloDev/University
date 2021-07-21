package com.Sodafactory;

import java.util.ArrayDeque;

public class Conveyor {
    ArrayDeque<Bottle> bottles = new ArrayDeque<>();

    void load(Bottle b) {
        if (!isOverloaded()) {
            bottles.add(b);
        }
        synchronized (this) {
            this.notify();
        }
    }

    Bottle withdraw() {
        return bottles.pollLast();
    }

    boolean isEmpty(){
        if (bottles.isEmpty()) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return bottles.isEmpty();
    }

    boolean isOverloaded() {
        return bottles.size() == 50;
    }
}
