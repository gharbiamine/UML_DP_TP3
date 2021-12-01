public class VueTroisLignes implements StrategieVue {
    protected String description;
    protected String nom;

    public VueTroisLignes() {

    }

    public VueTroisLignes(String description, String nom) {
        this.description = description;
        this.nom = nom;
    }

    public void affiche() {
        System.out.print(nom);
        System.out.print(description);
        System.out.println("troislignes");
    }
}
