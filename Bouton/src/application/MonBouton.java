package application;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class MonBouton extends Button implements EventHandler {
	private int compteur;
	
	public MonBouton() {
		compteur = 0;
	}
	@Override
	public void handle(Event event) {
		// TODO Auto-generated method stub
		compteur++;
		this.setText(String.valueOf(compteur));
	}

}
