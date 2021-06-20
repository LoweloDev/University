module pk1.vorlesung07.aufgaben36 {

    requires java.desktop;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.base;
    requires javafx.fxml;

    opens sample to javafx.base, javafx.controls, javafx.graphics, javafx.fxml, java.desktop;
}