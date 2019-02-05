
public class Camion {
	private String immat;
	private double capacite;
	
	public Camion(String immat){
		this.immat = immat;
	}
	public void afficher()
	{
		System.out.println("Je suis un Camion et l'immatriculation est " + immat);
	}
	public void avancer()
	{
		System.out.println("J'avance");
	}
}
