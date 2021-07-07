package UI.Forms.ChildControllers;

import UI.Forms.FormTypes;
import UI.Forms.MediaFormController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class PictureFormController extends MediaFormController implements Initializable {

    private FormTypes formType = FormTypes.picture;

    @FXML
    private AnchorPane locationPane;
    @FXML
    private TextField locationField;

    public FormTypes getFormType() {
        return formType;
    }

    public TextField getLocationField() {
        return locationField;
    }

    @Override
    public void addHandler() {
        verwaltung.addMedium(createMedia(
                formType,
                getTitleField().getText(),
                Integer.parseInt(getYearField().getText()),
                getLocationField().getText(),
                "")
        );
    }

    //Should be in seperate Model
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        locationPane.setManaged(true);
        locationPane.setVisible(true);
        getTitlePane().setManaged(true);
        getTitlePane().setVisible(true);
        getYearPane().setManaged(true);
        getYearPane().setVisible(true);
    }
}
