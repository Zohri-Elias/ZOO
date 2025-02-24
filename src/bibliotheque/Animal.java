package bibliotheque;

public abstract class Animal {
    private String nom;
    private boolean sante;

    public Animal(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract void manger();
    public abstract void faireDuBruit();
    public abstract void seDeplacer();

    public boolean getSante() {
        return sante;
    }

    public void setSante(boolean sante) {
        this.sante = sante;
    }

}
