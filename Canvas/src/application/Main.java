package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Canvas");
		BorderPane root = new BorderPane();
		
		Button rafraichir = new Button("Rafraîchir");
		rafraichir.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		root.setRight(rafraichir);
		Canvas c = new Canvas(500, 300);
		
		GraphicsContext g = c.getGraphicsContext2D();
		g.setFill(Color.BLUE);
		g.fillRect(0, 0, 1600, 900);
		
		root.setCenter(c);
		
		primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
