package TD5;

public interface IFleuriste {
    void creationBouquet(String nom, String prenom);
    int quantiteEnStock(String nomFleur);
    float prixDUneFleur(String nomFleur);
    void ajoutFleur(String nomFleur, int qte);
    void facturation();
}
