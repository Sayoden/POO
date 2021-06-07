package TPSUP1;

import java.util.Date;

public class Joueur extends Personne{

    public Joueur(String nom, String prenom, String nationalite, Date naissance, int age, int nbFreres, int nbSoeurs, int taille, double poids, String metier, boolean isStudent, String villeN) {
        super(nom, prenom, nationalite, naissance, age, nbFreres, nbSoeurs, taille, poids, metier, isStudent, villeN);
    }

    public enum Poste {
        GARDIEN,
        DEFENSEUR,
        MD,
        MO,
        ATTAQUANT;
    }

    private String equipe;

    private Poste poste;

    private int nbButs;

    @Override
    public String toString() {
        return "Joueur{" +
                "equipe='" + equipe + '\'' +
                ", poste=" + poste +
                ", nbButs=" + nbButs +
                "} " + super.toString();
    }
}
