package TP4;

import lombok.Getter;

public class PersonnePhysique extends Client{

    public enum Genre{
        HOMME,
        FEMME
    }

    private Genre genre;
    private String nom;
    private String prenom;

    public PersonnePhysique(String reference, String adresse, Genre genre, String nom, String prenom) {
        super(reference, adresse);
        this.genre = genre;
        this.nom = nom;
        this.prenom = prenom;
    }
}
