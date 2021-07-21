package sample;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PopUp {
    Stage stage = new Stage();
    AnchorPane anchorPane = new AnchorPane();
    Label avgReleaseDate = new Label("Kill timer");
    Button okButton = new Button("kill");

    PopUp() {
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.setMinHeight(100);
        stage.setMinWidth(200);

        anchorPane.getChildren().add(avgReleaseDate);
        anchorPane.getChildren().add(okButton);

        AnchorPane.setBottomAnchor(okButton, 0.0);
        AnchorPane.setRightAnchor(okButton, 0.0);
        AnchorPane.setLeftAnchor(okButton, 0.0);
        AnchorPane.setTopAnchor(avgReleaseDate, 25.0);
        AnchorPane.setRightAnchor(avgReleaseDate, 25.0);
        AnchorPane.setLeftAnchor(avgReleaseDate, 25.0);
        Scene newScene = new Scene(anchorPane);

        stage.setScene(newScene);
        stage.show();
    }
}
