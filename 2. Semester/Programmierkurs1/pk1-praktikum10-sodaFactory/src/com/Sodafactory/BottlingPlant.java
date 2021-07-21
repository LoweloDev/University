package com.Sodafactory;

public class BottlingPlant implements Runnable{

    Conveyor conveyor;

    BottlingPlant(Conveyor conveyor) {
        this.conveyor = conveyor;
    }

    @Override
    public void run() {
        Bottle bottle = new Bottle();
        System.out.println("Neue Flasche befüllt");
        conveyor.load(bottle);
    }
}
