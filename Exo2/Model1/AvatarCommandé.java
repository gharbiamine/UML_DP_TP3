
import java.util.*;

public class AvatarCommandé {

    ArrayList<SuperPouvoirAvatar> SuperPouvoirs = new ArrayList<SuperPouvoirAvatar>();
    ArrayList<Float> PrixSuperPouvoirs = new ArrayList<Float>();

    public void ajoutSuperPouvoir(FactorySuperPouvoir fsp, String nom, float prix) {
        SuperPouvoirs.add(fsp.getSuperPouvoir(nom));
        PrixSuperPouvoirs.add(prix);
    }

    public void affiche() {
        
    }

    public AvatarCommandé() {
    }

}