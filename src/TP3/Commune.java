package TP3;

public class Commune {

    private String nom;
    private Habitation[] habitations;

    public Commune(String nom, Habitation[] habitations) {
        if(habitations.length == 0) System.out.println("Le nombre d'habitation doit être supérieur à 0");
        else{
            this.nom = nom;
            this.habitations = habitations;
        }

    }

    public double prixTotal(){
        double prix = 0;
        for(Habitation habitation : habitations){
            prix = prix + habitation.impot();
        }

        return prix;
    }
}
