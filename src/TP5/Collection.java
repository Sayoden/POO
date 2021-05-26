package TP5;

import TP5.exceptions.AuteurException;
import TP5.interfaces.Ouvrage;

import java.util.ArrayList;
import java.util.List;

public class Collection implements Ouvrage {

    private final static int MAX_ARTICLES = 100;

    private List<Article> articles;

    private List<String> auteurs;

    private String titre;

    private String editeur;

    public Collection(String titre, String editeur) {
        this.articles = new ArrayList<>();
        this.auteurs = new ArrayList<>();
        this.titre = titre;
        this.editeur = editeur;
    }

    public void ajoutArticle(Article article) {
        if (!this.articles.contains(article)
                && (this.articles.size() + 1) > MAX_ARTICLES) {
            this.articles.add(article);
            String[] auteurs = article.getAuteurs();
            for (String auteur : auteurs) {
                ajoutAuteur(auteur);
            }
        }
    }

    public void suppressionArticle(Article article) {

        this.articles.remove(article);
    }

    @Override
    public void ajoutAuteur(String auteur) {
        if (!this.auteurs.contains(auteur)) {
            this.auteurs.add(auteur);
        }
    }

    @Override
    public void suppresionAuteur(String auteur) {

    }

    @Override
    public void nbPages(int nbPages) {

    }

    @Override
    public boolean disponible() {
        return false;
    }

    @Override
    public int nbExemplaires() {
        return 0;
    }

    @Override
    public double getLargeur() {
        return 0;
    }

    @Override
    public double getLongeur() {
        return 0;
    }

    @Override
    public double getHauteur() {
        return 0;
    }
}
