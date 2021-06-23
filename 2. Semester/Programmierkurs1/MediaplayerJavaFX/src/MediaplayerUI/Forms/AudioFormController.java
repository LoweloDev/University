package MediaplayerUI.Forms;

import MediaplayerUI.Forms.MediaFormController;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AudioFormController extends MediaFormController {
    @FXML
    private TextField interpreteField;

    @FXML
    public void actionHandler() {
        System.out.println(this.getTitleField().getText());
        System.out.println(interpreteField);
    }
}
