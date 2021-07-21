package UI;

import Data.Medienverwaltung;
import Data.Medium;
import UI.Forms.FormTypes;
import UI.Forms.MediaForm;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Controller implements Initializable {
    private final static Medienverwaltung verwaltung = new Medienverwaltung();

    ListView<String> mediumList = new ListView<String>();

    @FXML
    AnchorPane rootPane;

    @FXML
    VBox rootBox;

    @FXML
    public void exitHandler(){
        Stage stage = (Stage) rootPane.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void addAudio() throws Exception {
        MediaForm mf = new MediaForm(new Stage());
        mf.showView(FormTypes.audio);

    }

    @FXML
    public void addPicture() throws Exception {
        MediaForm mf = new MediaForm(new Stage());
        mf.showView(FormTypes.picture);
    }

    @FXML
    public void showAvgReleaseDate() throws Exception {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        AnchorPane anchorPane = new AnchorPane();
        Label avgReleaseDate = new Label(String.valueOf(verwaltung.avgReleaseDate()));
        Button okButton = new Button("ok");

        stage.setMinHeight(100);
        stage.setMinWidth(200);

        okButton.setOnAction(actionEvent -> stage.close());

        anchorPane.getChildren().add(avgReleaseDate);
        anchorPane.getChildren().add(okButton);

        AnchorPane.setBottomAnchor(okButton, 0.0);
        AnchorPane.setRightAnchor(okButton, 0.0);
        AnchorPane.setLeftAnchor(okButton, 0.0);
        AnchorPane.setTopAnchor(avgReleaseDate, 25.0);
        AnchorPane.setRightAnchor(avgReleaseDate, 25.0);
        AnchorPane.setLeftAnchor(avgReleaseDate, 25.0);
        Scene newScene = new Scene(anchorPane);

        stage.setScene(newScene);
        stage.show();
    }

    @FXML
    public void showYoungestMedium() throws Exception {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        AnchorPane anchorPane = new AnchorPane();
        Label avgReleaseDate = new Label(String.valueOf(verwaltung.showYoungestMedium().toString()));
        Button okButton = new Button("ok");

        stage.setMinHeight(100);
        stage.setMinWidth(200);

        okButton.setOnAction(actionEvent -> stage.close());

        anchorPane.getChildren().add(avgReleaseDate);
        anchorPane.getChildren().add(okButton);

        AnchorPane.setBottomAnchor(okButton, 0.0);
        AnchorPane.setRightAnchor(okButton, 0.0);
        AnchorPane.setLeftAnchor(okButton, 0.0);
        AnchorPane.setTopAnchor(avgReleaseDate, 25.0);
        AnchorPane.setRightAnchor(avgReleaseDate, 25.0);
        AnchorPane.setLeftAnchor(avgReleaseDate, 25.0);
        Scene newScene = new Scene(anchorPane);

        stage.setScene(newScene);
        stage.show();
    }

    @FXML
    public void saveMediaList() throws Exception {
        MediaForm mf = new MediaForm(new Stage());
        mf.showView(FormTypes.save);
    }

    @FXML
    public void saveMedia() throws Exception {
        MediaForm mf = new MediaForm(new Stage());
        mf.showView(FormTypes.saveMedia);
    }

    @FXML
    public void loadMedia() throws Exception {
        MediaForm mf = new MediaForm(new Stage());
        mf.showView(FormTypes.load);
    }

    public static Medienverwaltung getVerwaltung() {
        return verwaltung;
    }

    private ObservableList<String> mapToStringObservableList (ObservableList< ? extends Medium> observableList) {
        return observableList.stream()
                .map(Medium::toString)
                .collect(Collectors.collectingAndThen(
                        toList(), list -> FXCollections.observableArrayList(list))
                );
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        verwaltung.mediums.addListener((ListChangeListener<Medium>) change -> {
            mediumList.setItems(mapToStringObservableList(change.getList()));
        });

        rootBox.getChildren().add(mediumList);
    }
}
