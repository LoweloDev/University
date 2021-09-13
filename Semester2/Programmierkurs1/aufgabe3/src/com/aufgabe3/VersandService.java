package com.aufgabe3;

public record VersandService(Warteschlange warteschlange) implements Runnable{
    @Override
    public void run() {
        while(!warteschlange.isEmpty()) {
            Bestellung bestellung = warteschlange.dequeue();

            VersandTask = new VersandTask(bestellung);
        }
    }
}

// Note: Die Synchronisierung findet in der Warteschlange statt, dort sollte dann auch wait() bzw. notify() implementiert werden.
// in isEmpty bzw isFull oder enqueue und dequeue
