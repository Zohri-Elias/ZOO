package bibliotheque;

public class Visiteur {
    private String nom;
    private int age;
    private boolean billet;

    public Visiteur(String nom, int age) {
        this.nom = nom;
        this.age = age;
        this.billet = false;
    }

    public void acheterBillet() {
        this.billet = true;
        System.out.println(nom + " a acheté un billet.");
    }

    public void interagir(Animal a) {
        if (billet) {
            System.out.println(nom + " dit: Quel bel animal!");
            a.faireDuBruit();
        } else {
            System.out.println(nom + " doit acheter un billet pour interagir.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}