package TP2;

public class Livre {

    private String reference, titre;

    public Livre(String reference, String titre) {
        this.reference = reference;
        this.titre = titre;
    }

    public int getExemplaire(){
        return 100;
    }
}
