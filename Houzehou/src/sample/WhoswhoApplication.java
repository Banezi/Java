package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WhoswhoApplication {
    //6
    public static void main(String[] args) {
        //7
        Personne.getCompteur();
        //8
        Personne p = new Personne();
        Personne.getCompteur();
        //9
        System.out.println(p.toString());
        //11
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("fichier.txt"));
            fos.write(Byte.parseByte(p.toString()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
