package com.example.aufgabe4;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        final Pane root = new Pane();
        root.setMinHeight(500);
        root.setMinWidth(500);
        root.setStyle("-fx-background-color: #000");
        Scene scene = new Scene(root, 500, 500);

        root.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Rectangle rectangle = new Rectangle(mouseEvent.getX(), mouseEvent.getY(), 50, 50);
                rectangle.setFill(Color.GREEN);
                root.getChildren().add(rectangle);
            }
        });


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}