package bibliotheque;

public class Soigneur {
    private String nom;
    private String specialite;
    private Enclos enclosAffecte;

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

    public void nettoyerEnclos(Enclos e) {
        e.setProprete(true);
        System.out.println("L'enclos " + e.getId() + " a été nettoyé.");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public Enclos getEnclosAffecte() {
        return enclosAffecte;
    }

    public void setEnclosAffecte(Enclos enclosAffecte) {
        this.enclosAffecte = enclosAffecte;
    }
}