package MediaplayerUI.Forms;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AudioForm extends MediaForms {

    public AudioForm(Stage parentStage) {
        super(parentStage);
    }

    @Override
    public void showView() throws Exception {
        Parent pane = FXMLLoader.load(getClass().getResource("MediaForms.fxml"));
        this.setTitle("Add audio");
        this.setScene(new Scene(pane));
        this.showAndWait();
    }


}
