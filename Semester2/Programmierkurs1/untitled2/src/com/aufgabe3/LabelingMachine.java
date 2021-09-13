package com.aufgabe3;

import java.util.Random;

import static java.lang.Thread.sleep;

public class LabelingMachine implements Runnable{
    private final Conveyor conveyor;

    public LabelingMachine(Conveyor conveyor) {
        this.conveyor = conveyor;
    }

    @Override
    public void run() {
        Random r = new Random();
        while (true) {
                synchronized (conveyor) {
                    while (conveyor.isEmpty()) {
                        System.out.println("Etteketiermaschine: Warte auf Flasche");
                        try {
                            conveyor.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    conveyor.notifyAll();
                }

                Bottle bottle = conveyor.remove();
                bottle.setLabel(new Label(bottle.getInhalt()));
                System.out.println("Etteketiermaschine: " + bottle);

                // Sleep code placeholder
            }
        }
    }
}
