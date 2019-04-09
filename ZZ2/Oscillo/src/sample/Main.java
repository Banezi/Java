package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.Window;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane root = new BorderPane();
        primaryStage.setTitle("FXOscilleSimple 0.1");
        primaryStage.setScene(new Scene(root, Screen.getPrimary().getVisualBounds().getWidth() -100, Screen.getPrimary().getVisualBounds().getHeight()-100));
        primaryStage.show();

        //Right
        Button btn_raffraichir = new Button("Raffraichir");
        btn_raffraichir.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        root.setRight(btn_raffraichir);
        //Bottom
        Label label = new Label("Appuyer sur le bouton pour mettre à jour l'affichage");
        label.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        root.setBottom(label);
        //Center
        Canvas c = new Canvas(root.getWidth()-btn_raffraichir.getWidth()-100,root.getHeight() -100);
        root.setCenter(c);
        GraphicsContext g = c.getGraphicsContext2D();
        g.stroke();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
