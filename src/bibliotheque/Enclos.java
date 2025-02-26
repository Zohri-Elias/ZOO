package bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Enclos {
    private int id;
    private int capaciteMax;
    private boolean proprete;
    private List<Animal> listeAnimaux;

    public Enclos(int id, int capaciteMax) {
        this.id = id;
        this.capaciteMax = capaciteMax;
        this.proprete = true;
        this.listeAnimaux = new ArrayList<>();
    }

    public void ajouterAnimal(Animal a) {
        if (listeAnimaux.size() < capaciteMax) {
            listeAnimaux.add(a);
            System.out.println(a.getNom() + " a été ajouté à l'enclos " + id);
        } else {
            System.out.println("L'enclos " + id + " est plein.");
        }
    }

    public void retirerAnimal(Animal a) {
        listeAnimaux.remove(a);
        System.out.println(a.getNom() + " a été retiré de l'enclos " + id);
    }

    public boolean estPropre() {
        return proprete;
    }

    public int getId() { return id; }
    public void setProprete(boolean proprete) { this.proprete = proprete; }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public boolean getProprete() {
        return proprete;
    }

    public List<Animal> getListeAnimaux() {
        return listeAnimaux;
    }

    public void setListeAnimaux(List<Animal> listeAnimaux) {
        this.listeAnimaux = listeAnimaux;
    }
}