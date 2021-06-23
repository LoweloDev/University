package MediaplayerUI.Forms;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PictureFormController extends MediaFormController {

    private FormTypes formType = FormTypes.picture;

    @FXML
    private TextField locationField;

    public FormTypes getFormType() {
        return formType;
    }

    @Override
    public void addHandler() {
        System.out.println(this.getTitleField().getText());
    }
}
