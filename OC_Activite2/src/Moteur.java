public abstract class Moteur {
    protected TypeMoteur type;
    protected String cylindre;
    protected double prix;

    public Moteur(String cylindre, double prix) {
        this.cylindre = cylindre;
        this.prix = prix;
    }

    public final double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "Moteur{" +
                "type=" + type +
                ", cylindre='" + cylindre + '\'' +
                ", prix=" + prix +
                '}';
    }
}
