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

    private int nbPages;

    public Collection(String titre, String editeur, int nbPages) {
        this.articles = new ArrayList<>();
        this.auteurs = new ArrayList<>();
        this.titre = titre;
        this.editeur = editeur;
        this.nbPages = nbPages;
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
        for (String auteur : article.getAuteurs()) {
            suppresionAuteur(auteur);
        }
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
        this.auteurs.remove(auteur);
    }

    @Override
    public void nbPages(int nbPages) {
        this.nbPages = this.articles.size();
    }

    @Override
    public boolean disponible() {
        return false;
    }

    @Override
    public int nbExemplaires() {
        return this.articles.size();
    }

    @Override
    public double getLargeur() {
        return 10;
    }

    @Override
    public double getLongeur() {
        return 10;
    }

    @Override
    public double getHauteur() {
        return 10;
    }
}
