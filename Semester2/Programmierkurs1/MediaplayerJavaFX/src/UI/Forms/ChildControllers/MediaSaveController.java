package UI.Forms.ChildControllers;

import Data.Medium;
import UI.Forms.FormTypes;
import UI.Forms.MediaFormController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MediaSaveController extends MediaFormController implements Initializable {
    FormTypes formType = FormTypes.saveMedia;

    @FXML
    TextField filenameField;
    @FXML
    AnchorPane filenamePane;

    @Override
    public void addHandler() {
        verwaltung.serialize(new ArrayList<Medium>(verwaltung.mediums), filenameField.getText());
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
