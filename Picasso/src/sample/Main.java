package sample;
import javafx.application.Application;
import javafx.application.Platform;
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
import javafx.scene.control.Button;
import java.util.Random;

public class Main extends Application {
    private Random random;
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Java Picasso 1.0");
        BorderPane root = new BorderPane();
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();

        MenuBar menuBar = new MenuBar();
        menuBar.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        root.setTop(menuBar);
        Menu affichageMenu = new Menu("Affichage");
        MenuItem afficherItem = new MenuItem("Afficher");
        MenuItem quitterItem = new MenuItem("Quitter");
        affichageMenu.getItems().addAll(afficherItem,quitterItem);
        menuBar.getMenus().add(affichageMenu);
        Group group = new Group();
        group.setAutoSizeChildren(false);


        root.setCenter(group);
        afficherItem.setOnAction(event -> {
            random = new Random();
            for(int i=0; i<1000; i++)
            {
                Rectangle rect = new Rectangle();
                rect.setHeight(random.nextInt(100-10) + 10);
                rect.setWidth(random.nextInt(100-10) + 10);
                rect.setX(random.nextInt(1000));
                rect.setY(random.nextInt(1000));
                rect.setFill(Color.rgb(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                group.getChildren().add(rect);
            }
        });


        root.setTop(menuBar);

        quitterItem.setOnAction(event -> {
            Platform.exit();
        });
        primaryStage.setOnCloseRequest(event -> {
            Platform.exit();
            System.exit(0);
        });
    }


    public static void main(String[] args) {
        launch(args);
    }
}
