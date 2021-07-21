package com.Sodafactory;

public class Bottle {
    private DrinkTypes drinkType;
    private Label label;

    void printLabel() {
        System.out.println(getLabel());
    }

    Label getLabel() {
        return label;
    }

    void setLabel(Label label) {
        this.label = label;
    }

    DrinkTypes getDrinkType() {
        return drinkType;
    }

    void setDrinkType(DrinkTypes drinkType) {
        this.drinkType = drinkType;
    }
}
