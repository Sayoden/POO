package TP4;

public interface ICommande {

    double TVA = 0.2;

    double prixTotal();

    boolean ajoutArticle(Article a);

    boolean suppressionArticle(String ref);
}
