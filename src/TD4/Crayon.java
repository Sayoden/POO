package TD4;


import TD4.exceptions.PrixException;
import lombok.Getter;

public class Crayon {

    private String marque;

    @Getter
    private double prix;

    public Crayon(String marque, double prix) throws PrixException {
        if (prix < 0) {
            throw new PrixException("Le prix est inférieur à zéro");
        } else {
            this.prix = prix;
            this.marque = marque;
        }
    }

    public void setPrix(double prix) throws PrixException{
        if (prix > 0) {
            this.prix = prix;
        } else {
            throw new PrixException("Le prix est inférieur à zéro");
        }
    }

    public String affichageCrayon() {
        return "Marque: " + this.marque + " ,Prix: " + this.prix;
    }


}
