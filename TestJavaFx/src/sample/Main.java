package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Optional;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello World!");


    /*
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        /*
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Button otherButton = new Button("autre essai");
        root.getChildren().add(otherButton);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();

        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        Optional<ButtonType> r = a.showAndWait();
        if(r.isPresent() && r.get()==ButtonType.YES)
        {
            System.out.println("Yep!");
        }
    */
        BorderPane root = new BorderPane();
        Button btntop = new Button();
        Button btnright = new Button("Right");
        Button btnbottom = new Button("Bottom");
        Button btnleft = new Button("Left");
        Button btncenter = new Button("Center");
        btntop.setText("Top");
        root.setTop(btntop);
        root.setBottom(btnbottom);
        root.setCenter(btncenter);
        root.setLeft(btnleft);
        root.setRight(btnright);
        primaryStage.setScene(new Scene(root, 300, 250));
        btntop.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        btnright.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        btnleft.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        btncenter.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        btnbottom.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

        btntop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Vous avez cliqué le bouton Top : Classe Anonyme");
            }
        });

        EventHandler<ActionEvent> ae = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Vous avez cliqué le bouton Center : objet");
                afficheRight();
            }
            public void afficheRight()
            {
                System.out.println("Reference Pointer");
            }
        };
        btncenter.setOnAction(ae);

        btnbottom.setOnAction((EventHandler<ActionEvent>) e -> {
            System.out.println("Vous avez cliqué le bouton Bottom : Lambda");
        });

        //btnright.setOnAction(((EventHandler<ActionEvent>) ae)::afficheRight);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
