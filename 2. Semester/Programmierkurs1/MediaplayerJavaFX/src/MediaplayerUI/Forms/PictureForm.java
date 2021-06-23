package MediaplayerUI.Forms;
import MediaplayerUI.Forms.MediaForm;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PictureForm extends MediaForm {

    public PictureForm(Stage parentStage) throws IOException {
        super(parentStage);
    }

    @Override
    public void showView() {
        this.setTitle("Add picture");
        this.showAndWait();
    }


}
