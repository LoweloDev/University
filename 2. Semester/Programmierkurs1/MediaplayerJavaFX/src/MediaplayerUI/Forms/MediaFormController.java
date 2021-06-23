package MediaplayerUI.Forms;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public abstract class MediaFormController {
        @FXML
        private Button add;
        @FXML
        private Button cancel;
        @FXML
        private TextField titleField;
        @FXML
        private TextField yearField;

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
    }

