package TP2;

import java.util.Arrays;
import java.util.List;

public class Bibliotheque {

    private String nom;
    private Livre[] livres;
    private int nbLivres;
    private int nbExemplaires;

    final static int MAX_LIVRE = 100;
    final static int MAX_EXEMPLAIRES = 1000;


    public Bibliotheque(String nom) {
        this.nom = nom;
        this.livres = new Livre[MAX_LIVRE];
        this.nbLivres = 0;
        this.nbExemplaires = 0;
    }

    public void addLivre(Livre livre){
        if(nbLivres == 0){
            livres[0] = livre;
            nbLivres++;
            return;
        }

        if((livre.getExemplaires() + nbExemplaires) > MAX_EXEMPLAIRES){
            System.out.println("Il y a déjà trop d'exemplaire dans cette bibliothèque.");
            return;
        }

        for(int i = 0; i < nbLivres; i++){
            System.out.println(livres[i].getReference());
            if(livres[i].getReference().equals(livre.getReference())){
                System.out.println("Livre avec la même reference trouvé, abandon.");
                return;
            }
        }

        System.out.println("La réference n'a pas été trouvé, implémentation du livre dans la bibliothèque");
        livres[nbLivres] = livre;
        nbLivres++;
    }

    public void addOneExemplaire(String reference){
        if(nbExemplaires + 1 <= MAX_EXEMPLAIRES){
            for(int i = 0; i < nbLivres; i++){
                if(livres[i].getReference().equals(reference)){
                    System.out.println("Livre avec la reference trouvé, ajout d'un exemplaire");
                    livres[i].addOneExemplaire();
                    return;
                }
            }
        }else System.out.println("Il y a déjà trop d'exemplaire dans cette bibliothèque");

        System.out.println("La reference n'a pas été trouvé");
    }

    public void addMultiplesExemplaires(String reference, int nb){
        if(nbExemplaires + nb <= MAX_EXEMPLAIRES){
            for(int i = 0; i < nbLivres; i++){
                if(livres[i].getReference().equals(reference)){
                    System.out.println("Livre avec la reference trouvé, ajout d'un exemplaire");
                    livres[i].addMultiplesExemplaires(nb);
                    return;
                }
            }
        }else System.out.println("Il y a déjà trop d'exemplaire dans cette bibliothèque");

        System.out.println("La reference n'a pas été trouvé");
    }

    public void removeLivre(String reference){
        int emplacement;
        for(int i = 0; i < nbLivres; i++){
            if(livres[i].getReference().equals(reference)){
                emplacement = i;
                for(int y = emplacement; y < nbLivres; y++){
                    livres[i] = livres[i + 1];
                }
                nbLivres--;
                return;
            }
        }
    }

    public void display(){
        System.out.println("Nombre de livre: "+nbLivres);
        for(int i = 0; i < nbLivres; i++){
            System.out.println(livres[i].getTitre());
        }
    }

    public void removeExemplaire(String reference){
        for(int i = 0; i < nbLivres; i++){
            if(livres[i].getReference().equals(reference)){
                if(livres[i].getExemplaires() <= 0 || (livres[i].getExemplaires() - 1) <= 0){
                    removeLivre(reference);
                    System.out.println("Le livre a été supprimé car il n'y avait plus d'exemplaire");
                }else{
                    livres[i].removeExemplaire();
                }
                return;
            }
        }
    }
}

