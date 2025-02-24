package bibliotheque;

public class Soigneur {
    private String nom;
    private String specialite;

    public Soigneur(String nom, String specialite) {
        this.nom = nom;
        this.specialite = specialite;
    }

    public void diagnostiquer(Animal a) {
        if (Math.random() > 0.5) {
            a.setSante(false);
            System.out.println(a.getNom() + " est malade.");
        } else {
            System.out.println(a.getNom() + " est en bonne santé.");
        }
    }

    public void soigner(Animal a) {
        a.setSante(true);
        System.out.println(a.getNom() + " a été soigné.");
    }

}