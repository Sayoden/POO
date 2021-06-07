package TD5;


import java.util.ArrayList;
import java.util.List;

public class Fleuriste implements IFleuriste {

    private String nom;

    private Fleur[] fleurs;

    private int nbFleurs;

    private Client[] clients;

    private int nbClients;

    private Bouquet bouquet;

    private static final int MAXF = 100;

    private static final int MAXC = 100;

    public Fleuriste(String nom, Fleur[] fleurs, int nbFleurs, Client[] clients, Bouquet bouquet) {
        this.nom = nom;
        this.fleurs = new Fleur[MAXF];
        this.nbFleurs = nbFleurs;
        this.clients = new Client[MAXC];
        this.bouquet = bouquet;
    }

    @Override
    public void creationBouquet(String nom, String prenom) {
        for(int i = 0; i < nbClients; i++) {
            if(clients[i].getNom().equals(nom) && clients[i].getPrenom().equals(prenom)) {
                bouquet = new Bouquet(clients[i]);
                return;
            }
        }
        clients[nbClients] = new Client(nom, prenom);
        bouquet = new Bouquet(clients[nbClients]);
        nbClients++;
    }

    @Override
    public int quantiteEnStock(String nomFleur) {
        for (Fleur fleur : fleurs) {
            if (fleur.getNom().equals(nomFleur)) {
                return fleur.getQuantite();
            }
        }
        return 0;
    }

    @Override
    public float prixDUneFleur(String nomFleur) {
        for (Fleur fleur : fleurs) {
            if (fleur.getNom().equals(nomFleur)) {
                return fleur.getPrix_unitaire();
            }
        }
        return 0;
    }

    @Override
    public void ajoutFleur(String nomFleur, int qte) {

    }

    @Override
    public void facturation() {

    }
}