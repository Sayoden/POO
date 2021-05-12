package TP4;

public class Entreprise extends Client{

    private String contact;
    private String nom;

    public Entreprise(String reference, String adresse, String nom, String contact) {
        super(reference, adresse);
        this.contact = contact;
        this.nom = nom;
    }
}
