package TP1.Exercice5;

import TP1.Exercice4.Personne;

public class DemoTableau {
    public static void main(String[] args) {

        // declaration
        Personne[] unTableau;
        // allocation de memoire
        unTableau = new Personne[3];
        // initialisation
        unTableau[0] = new Personne("Goulois", "Lucas", 18);
        unTableau[1] = new Personne("Louis", "Iwinski", 25);
        unTableau[2] = new Personne("Tom", "Cuvelier", 21);

        for (Personne pers : unTableau) {
            String info = pers.valeursAttributs()
                    + " et son age est de "
                    + pers.getAge();

            System.out.println(info);
        }
        String[][] noms = {{"Mr. ", "Mrs. ", "Ms. "}, {"Smith",
                "Jones"}};
        System.out.println(noms[0][0] + noms[1][0]);
        System.out.println(noms[0][2] + noms[1][1]);
        for (int i = 0; i < noms.length; i++){
            for(int j = 0; j < noms[i].length; j++){
                System.out.println("Indices "+i+", "+j+" : "+noms[i][j]);
            }
        }
    }
}