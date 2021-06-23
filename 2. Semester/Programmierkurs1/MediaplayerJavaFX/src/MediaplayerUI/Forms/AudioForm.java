package MediaplayerUI.Forms;
import MediaplayerUI.Forms.MediaForm;
import javafx.stage.Stage;

import java.io.IOException;

public class AudioForm extends MediaForm {

    public AudioForm(Stage parentStage) throws IOException {
        super(parentStage);
    }

    @Override
    public void showView() {
        this.setTitle("Add audio");
        this.showAndWait();
    }


}
