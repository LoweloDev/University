package com.Sodafactory;

import java.time.Year;

import static java.lang.Thread.sleep;

record LabelingMachine(Conveyor conveyor) implements Runnable {
    @Override
    public void run() {
        while (!conveyor.isEmpty()) {
            Bottle bottle = conveyor.withdraw();
            bottle.setLabel(new Label(bottle.getDrinkType().toString(), Year.now().getValue() + 2));

            // Arbeitsgeschwindigkeitssimulation
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            bottle.printLabel();
        }
    }
}
