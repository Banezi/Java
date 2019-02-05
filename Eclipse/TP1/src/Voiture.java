
public class Voiture {
	private String immat;
	private int couleur;
	private int places;
	
	public Voiture(String immat){
		this.immat = immat;
	}
	public void afficher()
	{
		System.out.println("Je suis une Voiture et l'immatriculation est " + immat);
	}
	public void avancer()
	{
		System.out.println("J'avance");
	}
}
