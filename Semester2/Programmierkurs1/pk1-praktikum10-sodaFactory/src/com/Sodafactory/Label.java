package com.Sodafactory;

public class Label {
    String drinkType;
    int bestBefore;

    Label(String drinkType, int bestBefore) {
        this.drinkType = drinkType;
        this.bestBefore = bestBefore;
    }

    @Override
    public String toString() {
        return "Getränk: " + drinkType + " Haltbar bis: " + bestBefore;
    }
}
