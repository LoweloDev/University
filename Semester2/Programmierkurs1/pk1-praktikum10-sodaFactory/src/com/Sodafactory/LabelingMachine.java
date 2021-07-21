package com.Sodafactory;

import java.time.Year;

import static java.lang.Thread.sleep;

public class LabelingMachine implements Runnable {
    Conveyor conveyor;

    LabelingMachine(Conveyor conveyor) {
        this.conveyor = conveyor;
    }

    @Override
    public void run() {
        while(!conveyor.isEmpty()) {
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
