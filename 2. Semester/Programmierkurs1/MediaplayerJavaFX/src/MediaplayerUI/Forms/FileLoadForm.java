package MediaplayerUI.Forms;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FileLoadForm extends MediaForm {

    public FileLoadForm(Stage parentStage) throws IOException {
        super(parentStage);
    }

    @Override
    public void showView() throws Exception {
        this.setTitle("Load file");
        this.showAndWait();
    }


}
