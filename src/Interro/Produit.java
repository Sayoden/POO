package Interro;

public class Produit {

    private String nom;
    private int quantite;
    private double prix;
    private Fournisseur fournisseur;

    public Produit(String nom, int quantite, double prix, Fournisseur fournisseur) {
        this.nom = nom;
        this.quantite = quantite;
        this.prix = prix;
        this.fournisseur = fournisseur;
    }

    public Produit(String nom, int quantite, Fournisseur fournisseur) {
        this.nom = nom;
        this.quantite = quantite;
        this.fournisseur = fournisseur;
        this.prix = -1;
    }

    public String getNom() {
        return nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public double getPrix() {
        return prix;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public void printInfoProduits(){
        System.out.println(nom + " " + quantite + " " + prix);
        fournisseur.printValues();
    }

    public boolean verifPrice(){
        if(prix == -1) return false;
        return true;
    }

}
