package TP4;

public class Entreprise extends Client{

    private String contact;

    public Entreprise(String reference, String adresse, String contact) {
        super(reference, adresse);
        this.contact = contact;
    }
}
