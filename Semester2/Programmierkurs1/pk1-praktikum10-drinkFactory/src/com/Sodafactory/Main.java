package com.Sodafactory;

public class Main {

    public static void main(String[] args) {

        System.out.println("Arbeitsgeschwindigkeit BottlingPlant/LabelingMachine zzt. simuliert mit 500ms bzw. 1000ms");

        Conveyor conveyor = new Conveyor();

        Thread bottlingPlant = new Thread(new BottlingPlant(conveyor));
        Thread labelingMachine = new Thread(new LabelingMachine(conveyor));

        bottlingPlant.start();
        labelingMachine.start();
    }
}
