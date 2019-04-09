public class Polymo {
  
  public static void main(String[] param) {
    Vehicule u = new Vehicule();
    Voiture  v = new Voiture();
    Camion   w = new Camion();
    Vehicule x = new Voiture();
    //Voiture  y = new Vehicule(); // Erreur. Vehicule y = new Voiture() est correct car Voiture extends Vehicule

    u.afficher(); //Vehicule
    v.afficher(); //Voiture
    w.afficher(); //Vehicule
    x.afficher(); //Voiture. Attention ! on manipule une instance de voiture via objet Vehicule
  }

}

class Vehicule {
  public void afficher() {
    System.out.println("Vehicule");
  }  
}

class Voiture extends Vehicule {
  @Override
  public void afficher() {
    System.out.println("Voiture");
  }
}

class Camion extends Vehicule {
}
