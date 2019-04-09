package sample;

import java.time.Year;

public class Personne {
    //1
    private String nom;
    private String prenom;
    private String langage;
    private Year annee;

    //2
    public static int compteur;
    static {
        compteur = 0;
        System.out.println("Initialisation du compteur");
    }

    //3
    public Personne()
    {
        incrementeCompteur();
        System.out.println("Constructeur sans paramètre");
    }

    private void incrementeCompteur()
    {
        compteur++;
    }
    //4
    public Personne(String nom, String prenom, String langage, Year annee) {
        this.nom = nom;
        this.prenom = prenom;
        this.langage = langage;
        this.annee = annee;
        incrementeCompteur();
        System.out.println("Constructeur avec paramètres");
    }
    //5
    public static int getCompteur(){
        System.out.println("Le nombre d'instances crées est : " + compteur);
        return compteur;
    }
    //10
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(nom + " : " + prenom  + " : " + langage + " : " + annee);
        return sb.toString();
    }
}
