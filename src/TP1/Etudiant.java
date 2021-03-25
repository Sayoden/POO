package TP1;

import TP1.Exercice4.Personne;

public class Etudiant {

    String prenom;
    String nom;

    public Etudiant(String prenom, String nom){
        this.prenom = prenom;
        this.nom = nom;
    }

    public static void main(String[] args){
        Etudiant student = new Etudiant("Lucas", "Goulois");


        System.out.println("Prenom "+student.prenom+" et le nom "+student.nom);

    }

}
