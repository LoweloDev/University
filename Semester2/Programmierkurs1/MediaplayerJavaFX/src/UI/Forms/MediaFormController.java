package UI.Forms;

import Data.Medienverwaltung;
import UI.Controller;
import UI.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public abstract class MediaFormController {
        @FXML
        private Button add, cancel;
        @FXML
        private TextField titleField, yearField;
        @FXML
        AnchorPane titlePane, yearPane;

        protected Medienverwaltung verwaltung = Controller.getVerwaltung();


        @FXML
        public abstract void addHandler();

        @FXML
        public void cancelHandler() {
                Stage stage = (Stage) cancel.getScene().getWindow();
                stage.close();
        }

        public abstract FormTypes getFormType();

        public Button getAddButton() {
            return this.add;
        }

        public Button getCancelButton() {
            return this.cancel;
        }

        public TextField getTitleField() {
            return this.titleField;
        }

        public TextField getYearField() {
            return this.yearField;
        }

        public AnchorPane getTitlePane() {
                return titlePane;
        }

        public AnchorPane getYearPane() {
                return yearPane;
        }
}


