/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage;

/**
 *
 * @author mabane
 */
public class Voiture extends Vehicule{
    private int couleur;
    private int places;
    public Voiture(String immat) {
        super(immat);
    }
    

    public void afficher()
    {
            System.out.println("Je suis une Voiture et l'immatriculation est " + immat);
    }

  
    
    
}
