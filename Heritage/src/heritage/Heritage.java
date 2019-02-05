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
public class Heritage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Voiture V = new Voiture("VV 000 01");
		Camion C  = new Camion("CC 000 01");
		V.afficher();
		V.avancer();
		C.afficher();
		C.avancer();
    }
    
}
