public class VueProduit {
    protected String description;
    protected String nom;

    public VueProduit() {

    }

    public VueProduit(String description, String nom) {
        this.description = description;
        this.nom = nom;
    }

    public void affiche() {
        System.out.print(nom);
        System.out.print(description);

    }
}
