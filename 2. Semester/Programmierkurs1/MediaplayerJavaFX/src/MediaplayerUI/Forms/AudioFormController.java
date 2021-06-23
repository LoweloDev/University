package MediaplayerUI.Forms;

import MediaplayerData.Audio;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import MediaplayerUI.Forms.MediaForm;
import javafx.stage.Stage;

import javax.print.attribute.standard.Media;
import java.io.IOException;

public class AudioFormController extends MediaFormController {
    private FormTypes formType = FormTypes.audio;

    @FXML
    private TextField interpreteField;

    @Override
    public void addHandler() {
        System.out.println(this.getTitleField().getText());
    }

    public FormTypes getFormType() {
        return formType;
    }
}
