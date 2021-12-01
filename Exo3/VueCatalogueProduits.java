import java.util.ArrayList;

public class VueCatalogueProduits implements StrategieVue {
    ArrayList<VueProduit> vp = new ArrayList<VueProduit>();
    StrategieVue sg;

    public VueCatalogueProduits(String nom, ArrayList<VueProduit> vp) {
        switch (nom) {
        case "1":
            sg = new VueLigne();
            break;

        case "2":
            sg = new VueTroisLignes();
            break;

        default:
            break;
        }
        this.vp = vp;
    }

    public void affiche() {
        System.out.print("a");
    }

}
