package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class AngestellterBean {

    //36a default version
    private String name;

    boolean isPropertyVersion = false;

    AngestellterBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasName() {
        return this.name != null && !this.name.equals("");
    }


    //36b property version
    private StringProperty nameProperty;

    AngestellterBean(String name, Boolean isPropertyVersion) {
        this.nameProperty = new SimpleStringProperty(name);
        this.isPropertyVersion = isPropertyVersion;
    }

    public StringProperty getNameProperty() {
        return nameProperty;
    }

    public String getNamePropertyValue() {
        return nameProperty.get();
    }

    public void setNamePropertyValue(String name) {
        this.nameProperty.set(name);
    }

    public boolean hasNameProperty() {
        return isPropertyVersion;
    }

}
