package com.Sodafactory;

import static java.lang.Thread.sleep;

public class BottlingPlant implements Runnable{

    Conveyor conveyor;

    BottlingPlant(Conveyor conveyor) {
        this.conveyor = conveyor;
    }

    @Override
    public void run() {
        while (!conveyor.isOverloaded()) {
            Bottle bottle = new Bottle();
            bottle.setDrinkType(DrinkTypes.Bier);

            // Arbeitsgeschwindigkeitssimulation
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            conveyor.load(bottle);
            System.out.println("Befüllt");
        }
    }
}
