package com.Sodafactory;

public class Label {
    private String drinkType;
    private int bestBefore;

    Label(String drinkType, int bestBefore) {
        this.setDrinkType(drinkType);
        this.setBestBefore(bestBefore);
    }

    @Override
    public String toString() {
        return "Getränk: " + getDrinkType() + " Haltbar bis: " + getBestBefore();
    }

    int getBestBefore() {
        return bestBefore;
    }

    void setBestBefore(int bestBefore) {
        this.bestBefore = bestBefore;
    }

    String getDrinkType() {
        return drinkType;
    }

    void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }
}
