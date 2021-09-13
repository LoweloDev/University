package com.aufgabe3;

public class Bottle {
    private Label label;
    private final String inhalt;

    public Bottle(String inhalt) {
        this.inhalt = inhalt;
        label = new Label();
    }

    public Label getLabel() {
        return label;
    }

    public String getInhalt() {
        return inhalt;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return String.format("%s mindestens haltbar bis %d", label.getSorte(), label.getBestBefore());
    }
}
