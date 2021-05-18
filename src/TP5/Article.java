package TP5;


import TP5.exceptions.AuteurException;
import TP5.interfaces.Document;
import lombok.Getter;

public class Article implements Document {

    private String titre;

    private String[] auteurs;

    private int nbAuteur;

    private static final int MAX_AUTEUR = 5;

    public Article(String titre) {
        this.titre = titre;
        this.auteurs = new String[MAX_AUTEUR];
        this.nbAuteur = 0;
    }

    @Override
    public void ajoutAuteur(String auteur) throws AuteurException{
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
    public void suppresionAuteur(String auteur) throws AuteurException{
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
}
