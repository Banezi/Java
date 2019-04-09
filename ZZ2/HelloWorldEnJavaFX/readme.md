Stage : fenetre, primaryStage : fenetre par defaut

NomLayout root = new NomLayout();
root : est le conteneur principal : Scene principale
NomLayout : StackPane, BorderPane, etc. 

Affecter le Scene au Stage
primaryStage.setScene(new Scene(root, width, height));

//Ajouts des éléments dans le root
root.getChildren.add(element);

//Afficher le primaryStage
primaryStage.show();

//Evenement clic bouton
Button bt = new Button();
bt.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event){
        //Traitements à faire lors du clic du bouton bt
    }

});