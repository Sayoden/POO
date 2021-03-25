package TP3;

public class HabitationProfessionnelle extends Habitation{

    private int employes;
    private double surfaceOccupee;
    private int tranche;

    public HabitationProfessionnelle(String proprietaire, String adresse, double surface, int employes, double surfaceOccupee) {
        super(proprietaire, adresse, surface);
        this.employes = employes;
        if(surfaceOccupee > surface) System.out.println("Erreur, la surface occupée est plus grand que la surface.");
        else this.surfaceOccupee = surfaceOccupee;
        this.tranche = employes / 10;
    }

    @Override
    public double impot() {
        return PRIX_M2 * surfaceOccupee + (1000 * tranche);
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println(employes + " " + surfaceOccupee);
    }
}
