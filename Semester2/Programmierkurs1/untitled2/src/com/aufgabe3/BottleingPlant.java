package com.aufgabe3;

import java.util.Random;

import static java.lang.Thread.sleep;

public class BottleingPlant implements Runnable{
    private static final String[] sorten = {"Bier", "Cola", "Fanta", "Sprite"};
    private final Conveyor conveyor;

    public BottleingPlant(Conveyor conveyor) {
        this.conveyor = conveyor;
    }

    @Override
    public void run() {
        Random r = new Random();
        while (true) {
            try {
                synchronized (conveyor) {
                    while (conveyor.isFull()) {
                        System.out.println("Abfüllanlage: Warteschlange ist voll!");
                        conveyor.wait();
                    }
                    conveyor.notifyAll();
                }
                conveyor.add(new Bottle(sorten[r.nextInt(4)]));
                System.out.println("Abfüllanlage: Neue Flasche abgefüllt");

                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (InterruptedException e) {
                //TODO
            }
        }
    }
}
