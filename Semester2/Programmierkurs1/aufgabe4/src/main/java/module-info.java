module com.example.aufgabe4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.aufgabe4 to javafx.fxml;
    exports com.example.aufgabe4;
}