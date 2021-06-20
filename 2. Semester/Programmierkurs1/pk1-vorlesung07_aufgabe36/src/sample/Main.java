package sample;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        //36a Change Listener
        Eingabefeld input = new Eingabefeld("Name");
        AngestellterBean angestellter = new AngestellterBean("AngestellterName");

        input.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                angestellter.setName(observableValue.getValue());
            }
        });

        input.setText("New Name");
        System.out.println("After change " + angestellter.getName());


        // 36a Invalidation Listener
        Eingabefeld input2 = new Eingabefeld("Eingabefeld");
        AngestellterBean angestellter2 = new AngestellterBean("AngestellterName");

        input2.textProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                StringProperty string = (StringProperty) observable;
                angestellter2.setName(string.get());
            }
        });

        input2.setText("NewName2");
        System.out.println("After invalidation " + angestellter2.getName());

        
        //36b ChangeListener bound
        StringProperty input3 = new Eingabefeld("Name").textProperty();
        StringProperty angestellter3 = new AngestellterBean("AngestellterName", true).getNameProperty();

        System.out.println("After initialization before bind " + angestellter3.get());

        angestellter3.bind(input3);

        System.out.println("after bind before set " + angestellter3.get());

        input3.set("NewName3");
        System.out.println("after setting " + angestellter3.get());

    }


    public static void main(String[] args) {
        launch(args);
    }
}
