import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicule> voitures;

    public Garage() {
        voitures = new ArrayList<Vehicule>();
    }

    public List<Vehicule> getVoitures() {
        return voitures;
    }

    public void addVoiture(Vehicule vehicule) {
        voitures.add(vehicule);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        if(voitures.size() == 0)
            str.append("Aucune voiture sauvegardée !\n");

        str.append("****************************\n" +
                   "*  Garage Openclassrooms   *\n" +
                   "****************************\n");
        for(int i=0; i<voitures.size(); i++){
            str.append(voitures.get(i).toString());
        }
        return str.toString();
    }
}
