package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane pane = new Pane();
        pane.setMinWidth(500);
        pane.setMinHeight(500);
        Scene scene = new Scene(pane, 500, 500);

        pane.setOnMouseClicked( mouseEvent -> {
            Rectangle rectangle = new Rectangle(mouseEvent.getX(), mouseEvent.getY(), 50, 50);
            rectangle.setFill(Color.color(0, 1.0, 0));

            pane.getChildren().add(rectangle);
        });
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}