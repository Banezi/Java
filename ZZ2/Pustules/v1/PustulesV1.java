import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Optional;

public class PustulesV1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        HBox root = new HBox();
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();

        for(int i=0; i<10; i++)
        {
            MonBouton b = new MonBouton();
            b.setOnAction(b::handle);
            root.getChildren().add(b);
        }

        Alert a = new Alert(Alert.AlertType.CONFIRMATION, "Voulez-vous quitter ?");
        Optional<ButtonType> option = a.showAndWait();
        if(option.get()==ButtonType.OK)
        {
            System.out.println("Bye bye");
            Platform.exit();
            System.exit(0);
        }
    }
}