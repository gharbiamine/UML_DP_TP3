public class Test {
    public static void main(String[] args) {
        Forme triangle = new FormeComposite("rouge");
        triangle.ajouterForme(new FormePrimitive("vert"));
        triangle.ajouterForme(new FormePrimitive("bleu"));
        triangle.afficheCouleur();
        System.out.println(triangle.calculerSurface());

    }
}
