
import java.util.*;

public class VueCatalogue {

    protected List<VueProduit> produits = new ArrayList<>();
    protected Strategie version;

    public VueCatalogue(Strategie ver) {
        produits.add(new VueProduit("prod1"));
        produits.add(new VueProduit("prod2"));
        produits.add(new VueProduit("prod3"));
        produits.add(new VueProduit("prod4"));
        this.version = ver;
    }

    public void affiche() {
        version.affiche(produits);
    }
}