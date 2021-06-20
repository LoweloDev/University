package MediaplayerUI;

import MediaplayerUI.Forms.AudioForm;
import MediaplayerUI.Forms.FileLoadForm;
import MediaplayerUI.Forms.FileSaveForm;
import MediaplayerUI.Forms.PictureForm;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));

        primaryStage.setTitle("JavaFXify");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        PictureForm pictureForm = new PictureForm(primaryStage);
        pictureForm.showView();

        AudioForm audioForm = new AudioForm(primaryStage);
        audioForm.showView();

        FileLoadForm fileLoadForm = new FileLoadForm(primaryStage);
        fileLoadForm.showView();

        FileSaveForm fileSaveForm = new FileSaveForm(primaryStage);
        fileSaveForm.showView();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
