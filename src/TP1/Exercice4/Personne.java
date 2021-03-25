package TP1.Exercice4;

public class Personne {

    String nom, prenom;
    int age;

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String valeursAttributs() {
        return nom + " " + prenom;
    }

    public int getAge(){
        return age;
    }

    public void incAge() {
        age++;
    }

    public boolean majeure() {
        return age >= 18;
    }

    public boolean plusAgee(Personne personne){
        return age < personne.age;
    }

}

