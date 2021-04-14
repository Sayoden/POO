package TP4;

import lombok.Getter;

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
        for (Article article : articles) {
            if (article.getReference().equals(a.getReference())) {
                return false;
            }
        }

        if (nbArticle + 1 <= MAX_ARTICLE) {
            articles[nbArticle + 1] = a;
            nbArticle++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean suppressionArticle(String ref) {
        int emplacement;
        for(int i = 0; i < nbArticle; i++){
            if(articles[i].getReference().equals(ref)){
                emplacement = i;

            }
        }
        return false;
    }

}
