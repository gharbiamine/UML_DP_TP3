import java.util.*;

public class FormeComposite extends Forme {

    ArrayList<Forme> formes = new ArrayList<Forme>();

    public FormeComposite() {

    }

    public FormeComposite(String couleur) {
        super(couleur);
    }

    public void afficheCouleur() {
        System.out.println(this.couleur);
        for (Forme forme : formes) {
            forme.afficheCouleur();
        }
    }

    public double calculerSurface() {
        double somme = 0;
        for (Forme forme : formes) {
            somme += forme.calculerSurface();
        }
        return somme;
    }

    public boolean ajouterForme(Forme forme) {
        return (formes.add(forme));
    }

    public boolean supprimerForme(Forme forme) {
        return (formes.remove(forme));
    }

}