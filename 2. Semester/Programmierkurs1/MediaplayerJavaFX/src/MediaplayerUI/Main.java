package MediaplayerUI;

//import MediaplayerUI.Forms.FileLoadForm;
//import MediaplayerUI.Forms.FileSaveForm;
//import MediaplayerUI.Forms.PictureForm;
import MediaplayerUI.Forms.FormTypes;
import MediaplayerUI.Forms.MediaForm;
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

//        PictureForm picForm = new PictureForm(primaryStage);
//        picForm.showView();
//
//        FileLoadForm fileLoadForm = new FileLoadForm(primaryStage);
//        fileLoadForm.showView();
//
//        FileSaveForm fileSaveForm = new FileSaveForm(primaryStage);
//        fileSaveForm.showView();

        MediaForm mf = new MediaForm(primaryStage);
        mf.showView(FormTypes.audio);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
