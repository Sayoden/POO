package TP2;

public class Livre {

    public enum Genre{
        FRANCAISE,
        ETRANGERE,
        JEUNESSE,
        SCIENCE_FICTION,
        POLICE
    }

    private Genre genre;
    private String reference, titre, editeur;
    private int exemplaires;
    private Auteur auteur;

    public Livre(String reference, String titre, Auteur auteur, String editeur, int exemplaires, Genre genre) {
        this.reference = reference;
        this.titre = titre;
        this.auteur = auteur;
        this.editeur = editeur;
        this.exemplaires = exemplaires;
        this.genre = genre;
    }

    public String getReference() {
        return reference;
    }

    public String getTitre() {
        return titre;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public String getEditeur() {
        return editeur;
    }

    public int getExemplaires() {
        if(exemplaires < 0){
            exemplaires = 0;
        }
        return exemplaires;
    }

    public Genre getGenre(){
        return genre;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public void addOneExemplaire(){
        exemplaires++;
    }

    public void addMultiplesExemplaires(int nb){
        if(nb <= 0) return;
        exemplaires = exemplaires + nb;
    }

    public void removeExemplaire(){
        if(exemplaires <= 0) return;
        exemplaires--;
    }

    public boolean isPresent(){
        if(exemplaires <= 0) return false;
        return true;
    }


}
