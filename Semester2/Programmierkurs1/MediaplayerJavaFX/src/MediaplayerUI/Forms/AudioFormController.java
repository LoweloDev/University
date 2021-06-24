package MediaplayerUI.Forms;

import MediaplayerData.Audio;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import javafx.scene.layout.FlowPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AudioFormController extends MediaFormController implements Initializable {
    private FormTypes formType = FormTypes.audio;

    @FXML
    private TextField interpreteField;

    @FXML
    private FlowPane interpretePane;

    public TextField getInterpreteField() {
        return interpreteField;
    }

    public FormTypes getFormType() {
        return formType;
    }

    @Override
    public void addHandler() {
        verwaltung.addMedium(new Audio(
                        getInterpreteField().getText(),
                        5,
                        getTitleField().getText(),
                        Integer.parseInt(getYearField().getText())
                ));

        // Test
        verwaltung.showMediums();
    }

    //Should be in seperate Model
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        interpretePane.setManaged(true);
        interpretePane.setVisible(true);
    }
}
