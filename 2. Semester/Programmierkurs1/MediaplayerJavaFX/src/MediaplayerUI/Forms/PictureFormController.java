package MediaplayerUI.Forms;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PictureFormController extends MediaFormController {

    @FXML
    private TextField locationField;

    @FXML
    public void actionHandler() {
        System.out.println(this.getTitleField().getText());
        System.out.println(locationField);
    }
}
