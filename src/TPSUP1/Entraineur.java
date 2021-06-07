package TPSUP1;

import java.util.Date;

public class Entraineur extends Personne {

    private String equipe;

    private int anneeContrat;

    public Entraineur(String nom, String prenom, String nationalite, Date naissance, int age, int nbFreres, int nbSoeurs, int taille, double poids, String metier, boolean isStudent, String villeN, String equipe, int anneeContrat) {
        super(nom, prenom, nationalite, naissance, age, nbFreres, nbSoeurs, taille, poids, metier, isStudent, villeN);
        this.equipe = equipe;
        this.anneeContrat = anneeContrat;
    }

    @Override
    public String toString() {
        return "Entraineur{" +
                "equipe='" + equipe + '\'' +
                ", anneeContrat=" + anneeContrat +
                "} " + super.toString();
    }
}
