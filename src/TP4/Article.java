package TP4;

import lombok.Getter;

public class Article {

    @Getter
    private String reference, nom;

    @Getter
    private int quantite_commandee;

    @Getter
    private double prix_unitaire;

    public Article(String reference, String nom, double prix_unitaire, int quantite_commandee) {
        this.reference = reference;
        this.nom = nom;
        this.prix_unitaire = prix_unitaire;
        this.quantite_commandee = quantite_commandee;
    }


}
