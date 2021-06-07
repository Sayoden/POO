package TPSUP1;

import java.util.Date;

public class Personne {

    private String nom, prenom, nationalite, metier, villeN;
    private Date naissance;
    private int age, nbFreres, nbSoeurs, taille;
    private double poids;
    private boolean isStudent;

    public Personne(String nom, String prenom, String nationalite, Date naissance, int age, int nbFreres, int nbSoeurs, int taille, double poids, String metier, boolean isStudent, String villeN) {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
        this.naissance = naissance;
        this.age = age;
        this.nbFreres = nbFreres;
        this.nbSoeurs = nbSoeurs;
        this.taille = taille;
        this.poids = poids;
        this.metier = metier;
        this.isStudent = isStudent;
        this.villeN = villeN;
    }

    /**
     * Si la personne est fils ou fille unique
     */
    public Personne(String nom, String prenom, String nationalite, Date naissance, int age, int taille, double poids, String metier, boolean isStudent, String villeN) {
        new Personne(nom, prenom, nationalite, naissance, age, 0, 0, taille, poids, metier, isStudent, villeN);
    }

    /**
     * Si la nationalité n'est pas connue
     */
    public Personne(String nom, String prenom, Date naissance, int nbFreres, int nbSoeurs, int age, int taille, double poids, String metier, boolean isStudent, String villeN) {
        new Personne(nom, prenom, "Inconnue", naissance, age, nbFreres, nbSoeurs, taille, poids, metier, isStudent, villeN);
    }

    /**
     * Si la personne n'a pas de métier
     */
    public Personne(String nom, String prenom, String nationalite, Date naissance, int age, int nbFreres, int nbSoeurs, int taille, double poids, boolean isStudent, String villeN) {
        new Personne(nom, prenom, nationalite, naissance, age, nbFreres, nbSoeurs, taille, poids, null, isStudent, villeN);
    }

    /**
     * Si la ville de naissance n'est pas connnue
     */
    public Personne(String nom, String prenom, String nationalite, String metier, Date naissance, int age, int nbFreres, int nbSoeurs, int taille, double poids, boolean isStudent) {
        new Personne(nom, prenom, nationalite, naissance, age, nbFreres, nbSoeurs, taille, poids, metier, isStudent, "Inconnue");
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

    public String getMetier() {
        return metier;
    }

    public String getVilleN() {
        return villeN;
    }

    public Date getNaissance() {
        return naissance;
    }

    public int getAge() {
        return age;
    }

    public int getNbFreres() {
        return nbFreres;
    }

    public int getNbSoeurs() {
        return nbSoeurs;
    }

    public int getTaille() {
        return taille;
    }

    public double getPoids() {
        return poids;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public void setMetier(String metier) {
        this.metier = metier;
    }

    public void setVilleN(String villeN) {
        this.villeN = villeN;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNbFreres(int nbFreres) {
        this.nbFreres = nbFreres;
    }

    public void setNbSoeurs(int nbSoeurs) {
        this.nbSoeurs = nbSoeurs;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public void afficher() {
        System.out.println("Nom: " + getNom()
                + "," + "Prénom: " + getPrenom()
                + "," + "Date de naissance: " + getNaissance().toString()
                + "," + "Lieu de naissance: " + getVilleN()
                + "," + "Age: " + getAge()
                + "," + "Taille: " + getTaille()
                + "," + "Poids: " + getPoids()
                + "," + "Nationalité: " + getNationalite()
                + "," + "Nombre de freres: " + getNbFreres()
                + "," + "Nombre de soeurs: " + getNbSoeurs()
                + "," + "Métier: " + getMetier()
                + "," + "Est étudiant: " + isStudent()
        );
    }
}
