package com.aufgabe3;

record VersandService(Warteschlange warteschlange) implements Runnable {
    // Note alternativ kann man auch einfach normale Klasse machen und dann im Konstruktor warteschlange entsprechend übergeben

    @Override
    public void run() {
        while(!warteschlange.isEmpty()) {
            Bestellung bestellung = warteschlange.dequeue();

            new VersandTask(bestellung);
            // Note: zur vermeidung von busy waiting sollte noch wait und notify implementiert werden in der Warteschlange,
            // da dort sowieso synchronized wird. Entsprechend in methoden isEmpty oder isFull oder enqueue und dequeue
        }
    }
}
