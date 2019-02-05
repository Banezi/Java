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
public class Camion extends Vehicule{
    private double capacite;
    public Camion(String immat) {
        super(immat);
    }
    
    public void afficher()
    {
            System.out.println("Je suis un Camion et l'immatriculation est " + immat);
    }

   
    
}
