package com.aufgabe3;

public class Main {
    public static void main(String[] args) {
        Conveyor conveyor = new Conveyor();
        Thread plant = new Thread(new BottleingPlant(conveyor));
        Thread labeling = new Thread(new LabelingMachine(conveyor));

        plant.start();
        labeling.start();


    }
}
