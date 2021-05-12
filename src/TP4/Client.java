package TP4;

import lombok.Getter;

public abstract class Client {

    @Getter
    private String reference, adresse;

    public Client(String reference, String adresse) {
        this.reference = reference;
        this.adresse = adresse;
    }

}
