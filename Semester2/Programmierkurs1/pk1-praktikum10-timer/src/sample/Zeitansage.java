package sample;

import javafx.application.Application;
import javafx.stage.Stage;

public class Zeitansage extends Application {

    public void printTime() {
        PopUp popup = new PopUp();

        Timer timer = new Timer(new TimerListener() {
            int seconds = 0;

            @Override
            public void signalPerformed() {
                seconds++;
                System.out.println(seconds);
            }
        });

        timer.start();

        popup.okButton.setOnAction(actionEvent -> {
            popup.stage.close();
            timer.interrupt();
        });
    }

    @Override
    public void start(Stage primaryStage) {
        printTime();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
