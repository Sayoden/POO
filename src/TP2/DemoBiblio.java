package TP2;

import java.util.ArrayList;
import java.util.List;

public class DemoBiblio {

    public static void main(String[] args){

        Auteur aut1 = new Auteur("0", "Goulois", "Lucas", "France", 20);
        Auteur aut2 = new Auteur("1", "Alexis", "Grislin", "France", 18);

        //Exercice 1
        System.out.println(aut1.equals(aut2.getReference()));
        System.out.println(aut1.toString());

        //Exercice 2
        List<Livre> list = new ArrayList<>();
        Livre livre1 = new Livre("1", "Le royaume", aut1, "Editeur", 0, Livre.Genre.FRANCAISE);
        Livre livre2 = new Livre("2", "Le royaumjzbahze", aut1, "Editeur", 4, Livre.Genre.FRANCAISE);
        Livre livre3 = new Livre("3", "Le royzjajjzjaaume", aut2, "Editeur", 4, Livre.Genre.FRANCAISE);


        Bibliotheque biblio = new Bibliotheque("BU");

        biblio.addLivre(livre1);
        biblio.addLivre(livre2);
        biblio.addLivre(livre3);

        biblio.addOneExemplaire("4");
        biblio.addOneExemplaire("1");

        biblio.addMultiplesExemplaires("2", 10);

        System.out.println(livre1.getExemplaires());

        biblio.display();
        biblio.removeLivre("2");

        biblio.display();

    }
}
