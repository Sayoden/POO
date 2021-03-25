package TP2;

public class Bibliotheque {

    private String nom;
    private Livre[] livres;
    private int nbLivres;
    private int nbExemplaires;

    final static int MAX_LIVRES = 100;
    final static int MAX_EXEMPLAIRES = 1000;

    public Bibliotheque(String nom) {
        this.nom = nom;
        this.livres = new Livre[MAX_LIVRES];
        this.nbLivres = 0;
        this.nbExemplaires = 0;
    }

    public void addLivre(Livre livre){

        if(nbLivres == 0){
            livres[0] = livre;
            nbLivres++;
            return;
        }

        livres[nbLivres] = livre;
    }


}
