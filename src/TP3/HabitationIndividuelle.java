package TP3;

public class HabitationIndividuelle extends Habitation{

    private boolean piscine;
    private double surface;
    private int nbPiece;

    public HabitationIndividuelle(String proprietaire, String adresse, double surface, boolean piscine, int nbPiece) {
        super(proprietaire, adresse, surface);
        this.piscine = piscine;
        this.nbPiece = nbPiece;
        this.surface = surface;
    }

    @Override
    public double impot() {
        if(piscine) return 2 * surface + (100 * nbPiece) + 500;
        if(nbPiece != 0) return super.impot() + (100 * nbPiece);
        return super.impot();
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println(" Piscine:" + piscine + " " + nbPiece);
    }
}
