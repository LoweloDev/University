package com.Sodafactory;

public class LabelingMachine implements Runnable {
    Conveyor conveyor;

    LabelingMachine(Conveyor conveyor) {
        this.conveyor = conveyor;
    }

    @Override
    public void run() {
        Bottle bottle = conveyor.withdraw();

        System.out.println("Label");
    }
}
