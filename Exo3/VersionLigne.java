
import java.util.List;

public class VersionLigne implements Strategie {

	public void affiche(List<VueProduit> produits) {

		for (VueProduit prod : produits) {
			prod.affiche();
			System.out.println("");
		}
	}

}