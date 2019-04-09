class AE {
   private int valeur;

   public AE(int v) {
      valeur = v;
   }

   public final int getValeur() {
      return valeur;
   }

   public final void setValeur(int v) {
      valeur = v;
   }
}

public class Passage {

   static void methode1(int i) {
      i = 3;
   }

   static void methode2(int [] t) {
      t[4] = 7;
   }

   static void methode3(int [] t) {
      t = new int[10];
      t[4] = 9;
   }

   static void methode4(AE a) {
      a = new AE(2);
   }

   static void methode5(AE c) {
      c.setValeur(3);
   }

   static AE methode6(AE b) {
      b = new AE(4);
      return b;
   }

   public static void main(String[] param) {
      int i = 5;
      int[] t  = new int[10];
      
   
      methode1(i);  
      System.out.println(i); //5
      methode2(t);
      System.out.println(t[4]); //7 Le passage d'un tableau en paramètre se fait par réference
      methode3(t);
      System.out.println(t[4]); //7 et non 9
      
      AE a = new AE(1); 
      methode4(a);
      System.out.println(a.getValeur()); //1 et non 2
      methode5(a);
      System.out.println(a.getValeur()); //3
      a = methode6(a);
      System.out.println(a.getValeur()); //4
   }
}
