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
public abstract class Vehicule {
    protected String immat;

    public Vehicule(String immat){
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
