package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("FX Pustules");
		HBox root = new HBox();
		for(int i=0; i<10; i++)
		{
			MonBouton b = new MonBouton();
			b.setText("0");
			b.setOnAction(b::handle);
			root.getChildren().add(b);
		}
		
		
		primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
