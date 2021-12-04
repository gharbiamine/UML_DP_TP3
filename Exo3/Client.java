
public class Client {

        public static void main(String[] args) {
                VueCatalogue VueLigne = new VueCatalogue(new VersionLigne());
                VueCatalogue VueStandard = new VueCatalogue(new VersionProduit());
                VueLigne.affiche();
                VueStandard.affiche();
        }

}