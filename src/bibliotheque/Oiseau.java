package bibliotheque;

public class Oiseau extends Animal{

    public Oiseau(String nom, int age) {
        super(nom);
    }

    @Override
    public void manger() {
        System.out.println(getNom() + " mange.");
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " chante.");
    }

    @Override
    public void seDeplacer() {
        System.out.println(getNom() + " vole.");
    }
}
