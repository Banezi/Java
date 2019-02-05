public class Polymo {
  
  public static void main(String[] param) {
    Vehicule u = new Vehicule();
    Voiture  v = new Voiture();
    Camion   w = new Camion();
    Vehicule x = new Voiture();
    //Voiture  y = new Vehicule();

    u.afficher();
    v.afficher();
    w.afficher();
    x.afficher();
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
