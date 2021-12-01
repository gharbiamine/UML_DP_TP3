public abstract class Forme {

    protected static double surface = 55.0;
    protected String couleur;

    public Forme() {
        super();
    }

    public Forme(String couleur) {
        this.couleur = couleur;
    }

    public void ajouteCouleur(String couleur) {
        this.couleur = couleur;
    }

    public abstract void afficheCouleur();

    public abstract double calculerSurface();

    public abstract boolean ajouterForme(Forme forme);

    public abstract boolean supprimerForme(Forme forme);

}