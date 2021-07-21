package UI;

import Data.Medienverwaltung;
import Data.Medium;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.util.ArrayList;


public class Main extends Application {


    public void init(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene mainScene = new Scene(root);

        mainScene.getStylesheets().add(
                getClass().getResource("Main.css").toExternalForm()
        );
        primaryStage.setTitle("JavaFXify");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        init(primaryStage);
    }



    public static void main(String[] args) {
        launch(args);
    }
}
