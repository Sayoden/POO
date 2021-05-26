package TP5;

import TP5.interfaces.Ouvrage;
import TP5.interfaces.TroisD;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Biblio {

    private static final int MAX_OUVRAGE = 200;

    @Getter
    private final String nom;

    private List<Ouvrage> listOuvrages;

    public Biblio(String nom) {
        this.nom = nom;
        this.listOuvrages = new ArrayList<>();
    }

    public void ajouterOuvrage(Ouvrage ouvrage) {
        if (!this.listOuvrages.contains(ouvrage)
                && (this.listOuvrages.size() + 1) <= MAX_OUVRAGE) {
            this.listOuvrages.add(ouvrage);
        }
    }

    public void supprimerOuvrage(Ouvrage ouvrage) {
        this.listOuvrages.remove(ouvrage);
    }

    public double volume() {
        double longueur = this.listOuvrages.stream().mapToDouble(TroisD::getLongeur).sum();
        double largeur = this.listOuvrages.stream().mapToDouble(TroisD::getLargeur).sum();
        double hauteur = this.listOuvrages.stream().mapToDouble(TroisD::getHauteur).sum();

        return (longueur * largeur) * hauteur;
    }
}
