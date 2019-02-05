/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

/**
 *
 * @author mabane
 */

public class Tests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=5;
        int[] t = new int[10];
        methode1(i);
        System.out.println(i);
        methode2(t);
        System.out.println(t[4]);
        methode3(t);
        System.out.println(t[4]);
        System.out.println("-------------------------------");
        A a = new A(1);
        System.out.println("a.valeur = " + a.valeur + " et a = " + a);
        methode4(a);
        System.out.println("a.valeur = " + a.valeur + " et a = " + a);
        methode5(a);
        System.out.println("a.valeur = " + a.valeur + " et a = " + a);
        a = methode6(a);
        System.out.println("a.valeur = " + a.valeur + " et a = " + a);
    }
    
    static void methode1(int i) {
        i=3;
    }
    static void methode2(int [] t) {
        t[4]=7;
    }
    static void methode3(int [] t) {
        t= new int[10];
        t[4]=9;
    }
    
    //Digression 2
    static void methode4(A a) {
        a = new A(2);
    }
    static void methode5(A c) {
        c.valeur = 3;
    }
    static A methode6(A b) {
        b = new A(4);
        return b;
    }
}
