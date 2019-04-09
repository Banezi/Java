public class Gestion1 {
    public static void main(String[] args){
        //Voiture v = new Voiture();
        Voiture v = new Voiture("ZZ 002 TC");
        System.out.println(v.getImmat());
        System.out.println(v.getPlaces());
        Camion c = new Camion();
        System.out.println(c);
        System.out.println(c.toString());
        System.out.println("===============");
        Vehicule vehture = new Voiture();
        vehture.afficher(); //afficher(); de voiture
        //((Vehicule)vehture).afficher(); //Pas d'impact, affiche toujours afficher() de voiture
        System.out.println(((Voiture)vehture).getPlaces());
        System.out.println("=============== Polymorphisme marche directement ===============");
        Vehicule veh = new Vehicule();
        veh.afficher(); //Vehicule
        Voiture w = new Voiture();
        w.afficher(); //Voiture
        Camion cam = new Camion();
        cam.afficher(); //Camion
        Vehicule z = new Voiture();
        z.afficher(); //Voiture
        ((Voiture)z).special();
        System.out.println(z);
        System.out.println((Voiture)z);
        //Voiture i = new Vehicule(); //Erreur
    }
}

class Vehicule{
    protected String immat;

    public Vehicule(){
        immat = "0000 AA 00"; // ou this("0000 AA 00");
    }
    public Vehicule(String im){
        immat = im;
    }
    public void afficher(){
        System.out.println("Je suis un Véhicule");
    }

    public void avancer(){
        System.out.println("J'avance");
    }

    public final String getImmat(){
        return immat;
    }
    public final void setImmat(String im){
        immat = im;
    }

}


class Voiture extends Vehicule{
    private int couleur;
    private int places;

    public Voiture(){
        super();
    }

    public Voiture(String im){
        super(im);
    }

    public void afficher(){
        System.out.println("Je suis une Voiture et l'immatriculation est : " + immat);
    }
    
    public int getPlaces(){
        return places;
    }

    public void special(){
        System.out.println("Je suis spécial à la voiture");
    }
}


class Camion extends Vehicule{
    private double capacite;
    public Camion(){
        super();
    }
    public Camion(String im){
        super(im);
    }
    public void afficher(){
        System.out.println("Je suis un Camion et l'immatriculation est : " + immat);
    }

}