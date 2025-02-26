package bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Enclos> listeEnclos;
    private List<Soigneur> listeSoigneurs;
    private List<Visiteur> listeVisiteurs;
    private double caisses;

    public Zoo() {
        this.listeEnclos = new ArrayList<>();
        this.listeSoigneurs = new ArrayList<>();
        this.listeVisiteurs = new ArrayList<>();
        this.caisses = 0.0;
    }

    public void ajouterEnclos(Enclos e) {
        listeEnclos.add(e);
    }

    public void ajouterSoigneur(Soigneur s) {
        listeSoigneurs.add(s);
    }

    public void vendreBillet(Visiteur v) {
        v.acheterBillet();
        caisses += (v.getAge() < 16) ? 10 : 20;
    }

    public List<Soigneur> getListeSoigneurs() {
        return listeSoigneurs;
    }

    public void setListeSoigneurs(List<Soigneur> listeSoigneurs) {
        this.listeSoigneurs = listeSoigneurs;
    }

    public List<Enclos> getListeEnclos() {
        return listeEnclos;
    }

    public void setListeEnclos(List<Enclos> listeEnclos) {
        this.listeEnclos = listeEnclos;
    }

    public List<Visiteur> getListeVisiteurs() {
        return listeVisiteurs;
    }

    public void setListeVisiteurs(List<Visiteur> listeVisiteurs) {
        this.listeVisiteurs = listeVisiteurs;
    }

    public double getCaisses() {
        return caisses;
    }

    public void setCaisses(double caisses) {
        this.caisses = caisses;
    }
}