package TP3;

public class DemoCalcImpots {

    public static void main(String[] args){
        Habitation habitation = new Habitation("Lignier", "eaeaaea", 5);
        Habitation maisonIndividuelle = new HabitationIndividuelle("Goulois", "gvnajvbaz", 15, true, 10);
        Habitation habitationProfessionnelle = new HabitationProfessionnelle("Cuvelier", "hahbhjha",
                100, 16, 13);

        maisonIndividuelle.affiche();
        habitation.affiche();
        habitationProfessionnelle.affiche();
        System.out.println(maisonIndividuelle.impot());
        System.out.println(habitation.impot());
        System.out.println(habitationProfessionnelle.impot());

        Habitation[] habitations = new Habitation[3];
        habitations[0] = habitation;
        habitations[1] = maisonIndividuelle;
        habitations[2] = habitationProfessionnelle;


        Commune commune = new Commune("Lens", habitations);

        System.out.println("Total: " + commune.prixTotal());
    }
}
