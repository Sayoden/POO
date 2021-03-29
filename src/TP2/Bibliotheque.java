package TP2;

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
        if((livre.getExemplaires() + nbExemplaires) > MAX_EXEMPLAIRES){
            System.out.println("Il y a déjà trop d'exemplaire dans cette bibliothèque.");
            return;
        }

        for(int i = 0; i < nbLivres; i++){
            if(livres[i].getReference().equals(livre.getReference())){
                livres[i].addMultiplesExemplaires(livre.getExemplaires());
                System.out.println("Livre avec la même reference trouvé.");
                return;
            }
        }

        if(nbLivres < MAX_LIVRE){
            livres[nbLivres] = livre;
            nbLivres++;
            nbExemplaires += livre.getExemplaires();
        }
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
        for(int i = 0; i < nbLivres; i++){
            if(livres[i].getReference().equals(reference)){
                if(nbExemplaires + nb <= MAX_EXEMPLAIRES) {
                    System.out.println("Livre avec la reference trouvé, ajout d'un exemplaire");
                    livres[i].addMultiplesExemplaires(nb);
                    return;
                }else System.out.println("Il y a déjà trop d'exemplaire dans cette bibliothèque");

            }
        }
        System.out.println("La reference n'a pas été trouvé");
    }

    public void suppLivre(String reference){
        int emplacement;
        for(int i = 0; i < nbLivres; i++){
            if(livres[i].getReference().equals(reference)){
                emplacement = i;
                nbExemplaires -= livres[i].getExemplaires();
                if (nbLivres - emplacement >= 0)
                    System.arraycopy(livres, emplacement + 1, livres, emplacement, nbLivres - emplacement);
                nbLivres--;
                return;
            }
        }
    }

    public void afficher(){
        System.out.println("Nombre de livre: "+nbLivres);
        for(int i = 0; i < nbLivres; i++){
            System.out.println(livres[i].getTitre());
        }
    }

    public void removeExemplaire(String reference){
        for(int i = 0; i < nbLivres; i++){
            if(livres[i].getReference().equals(reference)){
                if(livres[i].getExemplaires() <= 0 || (livres[i].getExemplaires() - 1) <= 0){
                    suppLivre(reference);
                    System.out.println("Le livre a été supprimé car il n'y avait plus d'exemplaire");
                }else{
                    livres[i].removeExemplaire();
                }
                return;
            }
        }
    }

    public String getTitre(String ref) throws Exception{
        for(int i = 0; i < nbLivres; i++){
            if(livres[i].getReference().equals(ref)){
                return livres[i].getTitre();
            }
        }

        throw new Exception("Erreur");
    }

    public Auteur getAuteur(String ref) throws Exception{
        for(int i = 0; i < nbLivres; i++){
            if(livres[i].getReference().equals(ref)) return livres[i].getAuteur();
        }

        throw new Exception("Erreur");
    }

    public String getEditeur(String ref) throws Exception{
        for(int i = 0; i < nbLivres; i++){
            if(livres[i].getReference().equals(ref)) return livres[i].getEditeur();
        }

        throw new Exception("Erreur");
    }

    public Livre.Genre getGenre(String ref) throws Exception{
        for(int i = 0; i < nbLivres; i++){
            if(livres[i].getReference().equals(ref)) return livres[i].getGenre();
        }

        throw new Exception("Erreur");
    }

    public int getNbExemplaires(String ref) throws Exception{
        for(int i = 0; i < nbLivres; i++){
            if(livres[i].getReference().equals(ref)) return livres[i].getExemplaires();
        }

        throw new Exception("Erreur");
    }

    public void afficheLivre(String ref){
        for(int i = 0; i < nbLivres; i++){
            if(livres[i].getReference().equals(ref)){
                Livre livre = livres[i];

                System.out.println("Reference: " + livre.getReference()
                        + "," + "Editeur: " + livre.getEditeur()
                        + "," + "Titre: " + livre.getTitre()
                        + "," + "Auteur: " + livre.getAuteur().getNom()
                        + "," + "Titre: " + livre.getTitre()
                        + "," + "Genre: " + livre.getGenre().name()
                        + "," + "Exemplaires: " + livre.getExemplaires()
                );

            }
        }
    }
}

