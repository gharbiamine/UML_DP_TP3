
import java.util.*;

/**
 * 
 */
public class FactorySuperPouvoir {

    Map<String, SuperPouvoirAvatar> powerList = new HashMap<String, SuperPouvoirAvatar>();
    // Map<String, SuperPouvoirAvatar> powerNom = new HashMap<String,
    // SuperPouvoirAvatar>();

    public SuperPouvoirAvatar getSuperPouvoir(String nom) {
        SuperPouvoirAvatar stemp = powerList.get(nom);
        if (stemp != null) {
            return stemp;
        } else {
            SuperPouvoirAvatar sp = new SuperPouvoirAvatar(nom);
            powerList.put(nom, sp);
            return sp;
        }

    }

    public FactorySuperPouvoir() {

    }

    public void getSuperPouvoir() {

    }

}