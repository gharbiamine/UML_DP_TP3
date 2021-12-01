
public class FormePrimitive extends Forme {

    public FormePrimitive() {
    }

    public FormePrimitive(String couleur) {
        super(couleur);
    }

    public void afficheCouleur() {
        System.out.println(this.couleur);
    }

    public double calculerSurface() {
        return (Forme.surface);
    }

    public boolean ajouterForme(Forme forme) {
        return false;
    }

    public boolean supprimerForme(Forme forme) {
        return false;
    }

}