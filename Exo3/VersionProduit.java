
import java.util.List;

public class VersionProduit implements Strategie {

	public void affiche(List<VueProduit> produits) {

		for (int i = 0; i < produits.size(); i++) {

			produits.get(i).affiche();
			if (i != produits.size() - 1) {
				System.out.print("~_~");
			}
		}

	}
}