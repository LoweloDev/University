package com.Sodafactory;

import java.util.ArrayDeque;

public class Conveyor {
    ArrayDeque<Bottle> bottles = new ArrayDeque<>();

    void load(Bottle b) {
        if (!isOverloaded()) bottles.add(b);
    }

    Bottle withdraw() {
        return bottles.pollLast();
    }

    boolean isEmpty(){
        return bottles.isEmpty();
    }

    boolean isOverloaded() {
        return bottles.size() == 50;
    }
}
