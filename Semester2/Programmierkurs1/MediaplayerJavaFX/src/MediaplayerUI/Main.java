package MediaplayerUI;

//import MediaplayerUI.Forms.FileLoadForm;
//import MediaplayerUI.Forms.FileSaveForm;
//import MediaplayerUI.Forms.PictureForm;
import MediaplayerData.Medienverwaltung;
import MediaplayerUI.Forms.FormTypes;
import MediaplayerUI.Forms.MediaForm;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    Medienverwaltung verwaltung = new Medienverwaltung();

    public void init(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene mainScene = new Scene(root);

        mainScene.getStylesheets().add(
                getClass().getResource("caspian.css").toExternalForm()
        );

        primaryStage.setTitle("JavaFXify");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        init(primaryStage);
    }

    public Medienverwaltung getVerwaltung() {
        return verwaltung;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
