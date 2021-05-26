package TP5;

import TP5.interfaces.Document;
import TP5.interfaces.Ouvrage;

public class TestTP5 {

    public static void main(String[] args) {
        Biblio biblio = new Biblio("Bibliothèque test");
        Ouvrage ouvrage = new Livre(10, 20, 20, "Livre", "Lucas", 400);
        Article document = new Article("Article");
        Article document1 = new Article("Lucas Article");

        Collection collection = new Collection("Collection test", "Louis", 2);
        collection.ajoutArticle(document);
        collection.ajoutArticle(document1);

        biblio.ajouterOuvrage(collection);
        biblio.ajouterOuvrage(ouvrage);

        System.out.println(biblio.volume() + " cm3");
    }
}
