package Interro;

import TP1.Exercice4.Personne;

public class Client {

    private String nom, prenom;
    private Produit[] produit_list;
    private int produit_nb;

    static final int MAX_ACHATS = 100;

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.produit_list = new Produit[MAX_ACHATS];
        this.produit_nb = 0;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Produit[] getProduit_list() {
        return produit_list;
    }

    public int getProduit_nb() {
        return produit_nb;
    }

    public boolean clientBuySomeProduit(Fournisseur fournisseur){
        for(int i = 0; i < produit_nb; i++){
            if(produit_list[i].getFournisseur() == fournisseur) return true;
        }
        return false;
    }

    public static void main(String[] args){

        Fournisseur fournisseur = new Fournisseur("Goulois", "ttetetete");
        Produit[] produit = new Produit[6];
        produit[0] = new Produit("Goulois", 1,10, fournisseur);
        produit[1] = new Produit("Goulois", 1,1, fournisseur);
        produit[2] = new Produit("Tom", 1,1, fournisseur);
        produit[3] = new Produit("Alexis", 1,1, fournisseur);
        produit[4] = new Produit("Gabriel", 1,1, fournisseur);
        produit[5] = new Produit("Pedro", 1,1, fournisseur);

        Client client = new Client("goulois", "lucas");

        client.addProduit(produit[0]);
        client.addProduit(produit[1]);
        client.addProduit(produit[2]);

        for(int i = 0; i < client.produit_nb; i++){
            System.out.println(client.produit_list[i].getNom());
        }
        System.out.println("NB PRODUIT: "+client.produit_nb);

        client.addProduit(produit[3]);
        client.addProduit(produit[4]);

        System.out.println("NB PRODUIT: "+client.produit_nb);
        client.removeProduit("Gabriel");
        System.out.println("NB PRODUIT: "+client.produit_nb);

        for(int i = 0; i < client.produit_nb; i++){
            System.out.println(client.produit_list[i].getNom());

        }
        System.out.println("NB PRODUIT: "+client.produit_nb);

        System.out.println(client.calculTotalPrix());
        System.out.println(client.prixProduitMax());
    }

    public void addProduit(Produit produit){
        if(produit_nb <= MAX_ACHATS){
            if(produit.verifPrice()){
                for(int i = 0; i < produit_nb; i++){
                    if(produit_list[i].getNom().equals(produit.getNom())){
                        System.out.println("Ce client a déjà acheté un produit avec ce nom");
                        return;
                    }
                }
                System.out.println(produit.getNom());
                produit_list[produit_nb] = produit;
                produit_nb++;
            }else System.out.println("Ce produit n'a pas de prix défini");
        }else System.out.println("Le nombre de produit max pour ce client a été atteint");
    }

    public void removeProduit(String nom){
        int emplacement;

        for(int i = 0; i < produit_nb; i++){
            if(produit_list[i].getNom().equals(nom)){
                emplacement = i;
                for(int y = emplacement; y < produit_nb; y++){
                    produit_list[i] = produit_list[i + 1];
                }

                produit_nb--;
                return;
            }else System.out.println("Erreur");
        }
    }

    public double prixProduitMax(){
        double prixM = 0;
        for(int i = 0; i < produit_nb; i++){
            if(produit_list[i].getPrix() > prixM && produit_list[i].verifPrice()){
                prixM = produit_list[i].getPrix();
            }
        }

        return prixM;
    }

    public double calculTotalPrix(){
        double prixTotal = 0;
        for(int i = 0; i < produit_nb; i++){
            if(produit_list[i].verifPrice()){
                prixTotal += produit_list[i].getPrix();
            }
        }
        return prixTotal;
    }
}
