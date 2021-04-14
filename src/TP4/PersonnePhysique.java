package TP4;

import lombok.Getter;

public class PersonnePhysique extends Client{

    public enum Genre{
        HOMME,
        FEMME
    }

    private Genre genre;

    public PersonnePhysique(String reference, String adresse, Genre genre) {
        super(reference, adresse);
        this.genre = genre;
    }
}
