package TP1.Exercice6;

public class LibComplexe {

    static double extractionReel(Complexe complexe) {
        return complexe.getReel();
    }

    static double extractionImaginaire(Complexe complexe) {
        return complexe.getImaginaire();
    }

    static Complexe sum(Complexe c1, Complexe c2) {
        return new Complexe(c1.getReel() + c2.getReel(), c1.getImaginaire() + c2.getImaginaire());
    }

    static Complexe produit(Complexe c1, Complexe c2) {
        double r = c1.getReel() * c2.getReel() - c1.getImaginaire() * c2.getImaginaire();
        double i = c1.getReel() * c2.getImaginaire() + c1.getImaginaire() * c2.getReel();
        return new Complexe(r, i);
    }

    static void afficher(Complexe complexe) {
        System.out.println(extractionReel(complexe) + " " + extractionImaginaire(complexe));
    }

}
