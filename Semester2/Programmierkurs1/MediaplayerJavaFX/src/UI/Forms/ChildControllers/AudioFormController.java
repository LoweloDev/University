package UI.Forms.ChildControllers;

import UI.Forms.FormTypes;
import UI.Forms.MediaFormController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AudioFormController extends MediaFormController implements Initializable {
    private FormTypes formType = FormTypes.audio;

    @FXML
    private TextField interpreteField;

    @FXML
    private AnchorPane interpretePane;

    public TextField getInterpreteField() {
        return interpreteField;
    }

    public FormTypes getFormType() {
        return formType;
    }

    @Override
    public void addHandler() {
        verwaltung.addMedium(createMedia(
                formType,
                getTitleField().getText(),
                Integer.parseInt(getYearField().getText()),
                "",
                getInterpreteField().getText())
        );
    }

    //Should be in seperate Model
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        interpretePane.setManaged(true);
        interpretePane.setVisible(true);
        getTitlePane().setManaged(true);
        getTitlePane().setVisible(true);
        getYearPane().setManaged(true);
        getYearPane().setVisible(true);
    }
}
