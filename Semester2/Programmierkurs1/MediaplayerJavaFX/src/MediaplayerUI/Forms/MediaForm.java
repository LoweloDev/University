package MediaplayerUI.Forms;
import MediaplayerData.Medienverwaltung;
import MediaplayerUI.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MediaForm extends Stage {

    public MediaForm(Stage parentStage) {
        this.initOwner(parentStage);
        this.initModality(Modality.APPLICATION_MODAL);
    }

    private MediaFormController getController(FormTypes type) {
        MediaFormController[] controllers = {new AudioFormController(), new PictureFormController()};

        for(MediaFormController controller : controllers) {
            if (controller.getFormType() == type) {
                return controller;
            }
        }

        return null;
    }

    public void showView(FormTypes type) throws Exception {
        FormTypes[] formTypes = FormTypes.values();

        FXMLLoader xmlLoader = new FXMLLoader(getClass().getResource("MediaForm.fxml"));
        xmlLoader.setController(getController(type));
        Parent mediaForm = xmlLoader.load();

        for (FormTypes formType: formTypes) {
            if(type == formType) {
                this.setTitle("Add " + type.toString());
                this.setScene(new Scene(mediaForm));
                this.showAndWait();
            }
        }
    }
}
