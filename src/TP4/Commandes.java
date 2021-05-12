package TP4;

import lombok.Getter;

import java.util.Arrays;

public class Commandes implements ICommande {

    private String reference;
    private Client client;

    @Getter
    private Article[] articles;

    private int nbArticle;

    final static int MAX_ARTICLE = 20;

    public Commandes(String reference, Client client) {
        this.reference = reference;
        this.client = client;
        this.articles = new Article[MAX_ARTICLE];
        this.nbArticle = 0;
    }

    @Override
    public double prixTotal() {
        int prix = 0;
        for (Article article : articles) {
            double calcul = article.getQuantite_commandee() * article.getPrix_unitaire();
            prix += calcul;
        }
        return prix + (prix * TVA);
    }

    @Override
    public boolean ajoutArticle(Article a) {
        if (nbArticle + 1 <= MAX_ARTICLE) {
            if (nbArticle != 0) {
                for (Article article : this.articles) {
                    if (article.getReference().equals(a.getReference())) {
                        return false;
                    }
                }
            }
            this.articles[nbArticle] = a;
            this.nbArticle++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean suppressionArticle(String ref) {
        int emplacement;
        for(int i = 0; i < this.nbArticle; i++) {
            if (this.articles[i].getReference().equals(ref)) {
                emplacement = i;
                if (nbArticle - emplacement >= 0)
                    System.arraycopy(this.articles, emplacement + 1, this.articles, emplacement, this.nbArticle - emplacement);
                nbArticle--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Commandes{" +
                "reference='" + reference + '\'' +
                ", client=" + client +
                ", articles=" + Arrays.toString(articles) +
                ", nbArticle=" + nbArticle +
                '}';
    }
}
