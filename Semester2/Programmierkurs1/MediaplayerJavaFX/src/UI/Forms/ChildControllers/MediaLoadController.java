package UI.Forms.ChildControllers;

import UI.Forms.FormTypes;
import UI.Forms.MediaFormController;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MediaLoadController extends MediaFormController implements Initializable {
    FormTypes formType = FormTypes.load;

    @FXML
    TextField filenameField;
    @FXML
    AnchorPane filenamePane;

    @Override
    public void addHandler() {
        verwaltung.mediums.setAll(
                FXCollections.observableArrayList(laden(filenameField.getText()))
        );
    }

    @Override
    public FormTypes getFormType() {
        return formType;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        filenamePane.setManaged(true);
        filenamePane.setVisible(true);
    }
}
