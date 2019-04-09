package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane root = new BorderPane();
        primaryStage.setTitle("Java Picasso 1.0");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        //Top
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Affichage");
        MenuItem menuItemQuitter = new MenuItem("Quitter");
        menu.getItems().add(menuItemQuitter);
        menuBar.getMenus().add(menu);
        root.setTop(menuBar);

        //Center
        Group group = new Group();
        root.setCenter(group);
        int nombreFigures = 300;

        for(int i=0;i<nombreFigures; i++){
            Rectangle r = new Rectangle(Math.random()*(root.getWidth()),Math.random()*(root.getHeight()),Math.random()*(80-10),Math.random()*(80-10));
            r.setFill(Color.rgb(couleurAleatoire(),couleurAleatoire(),couleurAleatoire()));
            System.out.println(couleurAleatoire());
            group.getChildren().add(r);
        }
    }

    private int couleurAleatoire() {
        return (int) (Math.random()*255);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
