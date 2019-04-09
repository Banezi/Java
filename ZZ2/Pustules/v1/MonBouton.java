import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class MonBouton extends Button implements EventHandler<ActionEvent> {
    private int compteur;

    public MonBouton(){
        compteur = 0;
        setText(String.valueOf(compteur));
    }

    public void incrementer(){
        compteur++;
    }

    @Override
    public void handle(ActionEvent event) {
        compteur++;
        setText(String.valueOf(compteur));
    }

}

/*bt.setOnAction(new EventHandler<ActionEvent>(){
    public void handle(ActionEvent event){
        //Traitement à faire lors du clic du bouton
    }
});*/

 