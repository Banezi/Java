import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.lang.model.element.AnnotationValue;
import java.util.ArrayList;
import java.util.List;

public class Vehicule {
    protected double prix;
    protected String nom;
    protected List<Option> options;
    protected Marque marque = Marque.INCONNU;

    protected Moteur moteur;

    public Vehicule() {
        options = new ArrayList<Option>();
        moteur = new MoteurEssence("",0);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Voiture " + marque + " : " + this.getClass().getName() + " Moteur " + moteur.type + " " + moteur.cylindre + " (" + moteur.prix + ")" + "\n");
        return str.toString();
    }

    public void addOption(Option opt){
        options.add(opt);
    }

    public Marque getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }

    public List<Option> getOptions() {
        return options;
    }

    public final void setMoteur(Moteur moteur) {
        //this.moteur = null;
        if(moteur.type == TypeMoteur.DIESEL)
            moteur = new MoteurDiesel(moteur.cylindre,moteur.prix);
        if(moteur.type == TypeMoteur.ELECTRIQUE)
            moteur = new MoteurElectrique(moteur.cylindre,moteur.prix);
        if(moteur.type == TypeMoteur.ESSENCE)
            moteur = new MoteurEssence(moteur.cylindre,moteur.prix);
        if(moteur.type == TypeMoteur.HYBRIDE)
            moteur = new MoteurHybride(moteur.cylindre,moteur.prix);
    }
}
