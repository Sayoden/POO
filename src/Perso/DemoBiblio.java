package Perso;

public class DemoBiblio {

    static class Auteur{

        private String reference, nom, prenom, nationalite;
        private int age;

        public Auteur(String reference, String nom, String prenom, String nationalite, int age) {
            this.reference = reference;
            this.nom = nom;
            this.prenom = prenom;
            this.nationalite = nationalite;
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

        public String getNationalite() {
            return nationalite;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public boolean equals(Auteur auteur){
            return this.reference.equals(auteur.reference);
        }

        public String toString(){
            return "MACHIN MACHIN";
        }
    }

    public static void main(){
        Auteur auteur = new Auteur("test", "zebi", "lamouche", "francaise", 25);
    }
}
