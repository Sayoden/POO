package TP1.Exercice4;

import TP1.Etudiant;

public class Test {

    public static void main(String[] args){
        Personne personne = new Personne("Goulois", "Lucas", 18);
        Personne voisin = new Personne("Louis", "Iwinski", 20);

        //Affiche les attributs des gens
        System.out.println(personne.valeursAttributs());

        //Ajoute 1 an a la personne
        personne.incAge();

        //Affiche si la personne a 18 ans ou pas
        System.out.println(personne.majeure());

        //Affiche si le voisin est plus agé que la personne
        System.out.println(personne.plusAgee(voisin));
    }
}
