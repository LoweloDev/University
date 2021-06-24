package MediaplayerUI;

import MediaplayerUI.Forms.FormTypes;
import MediaplayerUI.Forms.MediaForm;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.*;

public class Controller {
    @FXML
    AnchorPane rootPane;

    @FXML
    public void addAudio() throws Exception {
        Stage stage = (Stage) rootPane.getScene().getWindow();
        MediaForm mf = new MediaForm(stage);
        mf.showView(FormTypes.audio);

    }

    @FXML
    public void addPicture() throws Exception {
        Stage stage = (Stage) rootPane.getScene().getWindow();
        MediaForm mf = new MediaForm(stage);
        mf.showView(FormTypes.picture);
    }
}
