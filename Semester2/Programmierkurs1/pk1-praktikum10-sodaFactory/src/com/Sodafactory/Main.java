package com.Sodafactory;

public class Main {

    public static void main(String[] args) {

        Conveyor conveyor = new Conveyor();

        Thread bottlingPlant = new Thread(new BottlingPlant(conveyor));
        Thread labelingMachine = new Thread(new LabelingMachine(conveyor));

        bottlingPlant.start();
        labelingMachine.start();
    }
}
