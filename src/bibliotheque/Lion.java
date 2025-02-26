package bibliotheque;

public class Lion extends Animal{

    public Lion(String nom, int age) {
        super(nom);
    }

    @Override
    public void manger() {
        System.out.println(getNom() + " mange.");
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " rugit.");
    }

    @Override
    public void seDeplacer() {
        System.out.println(getNom() + " marche majestueusement.");
    }
}

