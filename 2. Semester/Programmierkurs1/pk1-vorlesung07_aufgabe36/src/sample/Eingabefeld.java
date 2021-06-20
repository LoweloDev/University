package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Control;

public class Eingabefeld extends Control {

    private StringProperty text;

    public Eingabefeld(String text) {
        super();
        this.text = new SimpleStringProperty(text);
    }

    public StringProperty textProperty() {
        return text;
    }

    public void setText (String text) {
        this.text.set(text);
    }
}
