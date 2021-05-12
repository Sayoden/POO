package TP5;

import TP5.exceptions.AuteurException;
import TP5.interfaces.Ouvrage;
import lombok.Setter;

public class Livre implements Ouvrage {

    private double largeur;

    private double longeur;

    private double hauteur;

    private String titre;

    private String editeur;

    private String[] auteurs;

    private int nbPage;

    private int nbAuteur;

    private int nbExemplaire = 0;

    @Setter
    private boolean disponible = true;

    private static final int MAX_AUTEUR = 20;

    public Livre(double largeur, double longeur, double hauteur, String titre, String editeur, int nbPage) {
        this.largeur = largeur;
        this.longeur = longeur;
        this.hauteur = hauteur;
        this.titre = titre;
        this.editeur = editeur;
        this.auteurs = new String[MAX_AUTEUR];
        this.nbAuteur = 0;
        nbPages(nbPage);
    }

    @Override
    public void ajoutAuteur(String auteur) throws AuteurException {
        if (nbAuteur + 1 <= MAX_AUTEUR) {
            if (nbAuteur != 0) {
                for (String aut : this.auteurs) {
                    if (aut.equals(auteur)) {
                        throw new AuteurException("Cet auteur est déjà présent");
                    }
                }
            }
            this.auteurs[nbAuteur] = auteur;
            this.nbAuteur++;
        } else {
            throw new AuteurException("Le nombre max d'auteur a été atteint");
        }
    }

    @Override
    public void suppresionAuteur(String auteur) throws AuteurException {
        int emplacement;
        for(int i = 0; i < this.nbAuteur; i++) {
            if (this.auteurs[i].equals(auteur)) {
                emplacement = i;
                if (nbAuteur - emplacement >= 0)
                    System.arraycopy(this.auteurs, emplacement + 1, this.auteurs, emplacement, this.nbAuteur - emplacement);
                nbAuteur--;

            }
        }
        throw new AuteurException("Impossible de supprimer cet Auteur");
    }

    @Override
    public void nbPages(int nbPages) {
        this.nbPage = nbPages;
    }

    @Override
    public boolean disponible() {
        return this.disponible;
    }

    @Override
    public int nbExemplaires() {
        return this.nbExemplaire;
    }

    @Override
    public double getLargeur() {
        return this.largeur;
    }

    @Override
    public double getLongeur() {
        return this.longeur;
    }

    @Override
    public double getHauteur() {
        return this.hauteur;
    }
}
