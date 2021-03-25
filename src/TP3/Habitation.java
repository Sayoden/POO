package TP3;

public class Habitation {

    /**
     * Attributs
     */
    private String proprietaire, adresse;
    private double surface;

    /**
     * Constantes
     */
    final static int PRIX_M2 = 2;

    public Habitation(String proprietaire, String adresse, double surface) {
        this.proprietaire = proprietaire;
        this.adresse = adresse;
        this.surface = surface;
    }

    public double impot(){
        return surface * PRIX_M2;
    }

    public void affiche(){
        System.out.println(proprietaire + " " + adresse + " " + surface);
    }
}
