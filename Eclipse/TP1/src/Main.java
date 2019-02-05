
public class Main {
	
	public static void main(String[] args) {
		Voiture V = new Voiture("VV 000 01");
		Camion C  = new Camion("CC 000 01");
		V.afficher();
		V.avancer();
		C.afficher();
		C.avancer();
	}

}
