import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class PustulesV2 extends Application {
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
            Button b = new Button("0");
            b.setOnAction(new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event){
                    b.setText(String.valueOf( Integer.parseInt(b.getText()) + 1));
                }
            });
            root.getChildren().add(b);
        }

    }
}