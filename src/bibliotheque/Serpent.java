package bibliotheque;

public class Serpent extends Animal{

    public Serpent(String nom, int age) {
        super(nom);
    }

    @Override
    public void manger() {
        System.out.println(getNom() + " mange.");

    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " siffle.");
    }

    @Override
    public void seDeplacer() {
        System.out.println(getNom() + " rugit.");
    }
}
