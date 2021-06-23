package MediaplayerUI.Forms;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;

public abstract class MediaForm extends Stage {
    Parent mediaForm = FXMLLoader.load(getClass().getResource("MediaForm.fxml"));

    public MediaForm(Stage parentStage) throws IOException {
        this.initOwner(parentStage);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setScene(new Scene(mediaForm));
    }

    protected abstract void showView() throws Exception;
}
