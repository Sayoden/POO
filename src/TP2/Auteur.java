package TP2;

public class Auteur {

    private String reference, nom, prenom, nationalité;
    private int age;

    public Auteur(String reference, String nom, String prenom, String nationalité, int age) {
        this.reference = reference;
        this.nom = nom;
        this.prenom = prenom;
        this.nationalité = nationalité;
        this.age = age;
    }

    public boolean equals(String reference){
        if (reference == this.reference) return true;
        return false;
    }

    public String toString() {
        return reference+" "+
                nom+" "+
                prenom+" "+
                nationalité+" "+
                age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getReference() {
        return reference;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNationalité() {
        return nationalité;
    }

    public int getAge() {
        return age;
    }


}
