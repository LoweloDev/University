package MediaplayerUI.Forms;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public abstract class MediaFormController {
        @FXML
        private Button add;
        @FXML
        private Button cancel;
        @FXML
        private TextField titleField;
        @FXML
        private TextField yearField;

        public MediaFormController() {
        }

        @FXML
        public abstract void actionHandler() throws IOException;

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

