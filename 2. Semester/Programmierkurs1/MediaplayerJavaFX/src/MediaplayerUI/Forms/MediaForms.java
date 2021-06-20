package MediaplayerUI.Forms;
import javafx.stage.Modality;
import javafx.stage.Stage;

public abstract class MediaForms extends Stage {

    public MediaForms(Stage parentStage) {
        this.initOwner(parentStage);
        this.initModality(Modality.APPLICATION_MODAL);
    }

    protected abstract void showView() throws Exception;
}
