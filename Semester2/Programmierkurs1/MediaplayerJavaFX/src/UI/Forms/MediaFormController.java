package UI.Forms;

import Data.*;
import PlaceholderDB.IDao;
import UI.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;

//TODO Rework, Templating with listView, rm -r Controller Hell

public abstract class MediaFormController implements IDao {
        protected final static Medienverwaltung verwaltung = Controller.getVerwaltung();

        @FXML
        private Button add, cancel;
        @FXML
        private TextField titleField, yearField;
        @FXML
        AnchorPane titlePane, yearPane;

        @FXML
        public abstract void addHandler();

        @FXML
        public void cancelHandler() {
                Stage stage = (Stage) cancel.getScene().getWindow();
                stage.close();
        }

        public Medium createMedia(FormTypes type, String title, int year, String location, String interprete) {
                if (type == FormTypes.audio) {
                        return new Audio(interprete, 1, title, year);
                } else {
                        return new Bild(location, title, year);
                }
        }

        @Override
        public void speichern(ArrayList<Medium> liste, String filename) {
                verwaltung.serialize(liste, filename);
        }

        @Override
        public ArrayList<Medium> laden(String filename) {
                return verwaltung.bulkDeserialize(filename);
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


