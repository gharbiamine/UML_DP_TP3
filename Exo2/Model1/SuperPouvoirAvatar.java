
import java.util.*;

/**
 * 
 */
public class SuperPouvoirAvatar {

    public String nom;
    public String description;
    public float prix;

    public SuperPouvoirAvatar() {
    }

    public SuperPouvoirAvatar(String nom) {
        this.nom = nom;
    }

    public SuperPouvoirAvatar(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    public void affiche(float prix) {
        System.out.println(prix);
    }

}