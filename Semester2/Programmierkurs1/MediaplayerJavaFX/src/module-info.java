module MediaplayerJavaFX {
    requires java.desktop;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.base;
    requires javafx.fxml;

    opens UI to javafx.base, javafx.controls, javafx.graphics, javafx.fxml, java.desktop;
    opens UI.Forms to java.desktop, javafx.base, javafx.controls, javafx.fxml, javafx.graphics;
    opens UI.Forms.ChildControllers to java.desktop, javafx.base, javafx.controls, javafx.fxml, javafx.graphics;
//    opens MediaplayerUI.Forms.Picture to java.desktop, javafx.base, javafx.controls, javafx.fxml, javafx.graphics;
//    opens MediaplayerUI.Forms.Audio to java.desktop, javafx.base, javafx.controls, javafx.fxml, javafx.graphics;
}