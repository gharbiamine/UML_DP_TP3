public class VueLigne implements StrategieVue {
    protected String description;
    protected String nom;

    public VueLigne() {

    }

    public VueLigne(String description, String nom) {
        this.description = description;
        this.nom = nom;
    }

    public void affiche() {
        System.out.print(nom);
        System.out.print(description);
        System.out.println("ligne");
    }
}
