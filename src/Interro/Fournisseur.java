package Interro;

public class Fournisseur {

    /*/
    Attributs
     */
    private String nom, adresse;

    /*/
    Constructeur
     */
    public Fournisseur(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    /*/
    Getters
     */
    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    /*/
    Méthodes
     */
    public static boolean verifInstance(Fournisseur f1, Fournisseur f2){
        if(f1.nom.equals(f2.nom) && f1.adresse.equals(f2.adresse)) return true;
        return false;
    }

    public void printValues(){
        System.out.println(nom + " " + adresse);
    }
}
