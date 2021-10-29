package com.Sodafactory;

import java.time.Year;

import static java.lang.Thread.sleep;

record LabelingMachine(Conveyor conveyor) implements Runnable {
    @Override
    public void run() {
        while (!conveyor.isEmpty()) {
                    Bottle bottle = conveyor.withdraw();
                    bottle.setLabel(new Label(bottle.getDrinkType().toString(), Year.now().getValue() + 2));
                    // useless block Arbeitsgeschwindigkeitssimulation in Aufgabe verlangt
                    bottle.printLabel();
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // enteal
        }
    }
}
