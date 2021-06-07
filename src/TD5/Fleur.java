package TD5;

import lombok.Getter;

public class Fleur {

    @Getter
    private String nom;

    @Getter
    private float prix_unitaire;

    @Getter
    private int quantite;

    public Fleur(String nom, float prix_unitaire, int quantite) {
        this.nom = nom;
        this.prix_unitaire = prix_unitaire;
        this.quantite = quantite;
    }
}
