package com.Sodafactory;

import static java.lang.Thread.sleep;

record BottlingPlant(Conveyor conveyor) implements Runnable {
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
