package TP1.Exercice7;

import TP1.Exercice4.Personne;

public class TabPersonnes {

    //constante
    static final int MAX = 5;

    Personne[] amis;
    int nbAmis;

    public TabPersonnes() {
        this.amis = new Personne[MAX];
        this.nbAmis = 0;
    }


    public static void main(String[] str){
        TabPersonnes tabPers = new TabPersonnes();

        //Initialisation des personnes
        Personne[] pers = new Personne[6];
        pers[0] = new Personne("Goulois", "Lucas", 26);
        pers[1] = new Personne("Louis", "Iwinski", 25);
        pers[2] = new Personne("Tom", "Cuvelier", 21);
        pers[3] = new Personne("Alexis", "Grislin", 36);
        pers[4] = new Personne("Gabriel", "Gressier", 15);
        pers[5] = new Personne("Pedro", "Sanchez", 20);

        tabPers = tabPers.remplissage(pers);

        System.out.println(tabPers.nbAmis+" "+tabPers.amis.length);

        System.out.println("Plus petit entre les deux personnes: "+plusPetit(pers[0], pers[2]));

        System.out.println(tabPers.plusJeune());
    }

    public TabPersonnes remplissage(Personne[] pers){
        TabPersonnes personnes = new TabPersonnes();

        if(pers.length == 1){
            amis[0] = pers[0];
            personnes.nbAmis++;
        }else{
            for (int i = 0; i < pers.length; i++){
                if (!( i < MAX)){
                    System.out.println("Plus de "+MAX);
                    break;
                }

                personnes.amis[i] = pers[i];
                personnes.nbAmis++;

            }
        }

        return personnes;
    }

    static int plusPetit(Personne pers, Personne pers2){
        return Math.min(pers.getAge(), pers2.getAge());
    }

    public int plusJeune(){

        int maxAge = amis[0].getAge();
        for (int i = 0 ; i < nbAmis; i++) {
            if (amis[i].getAge() <= maxAge) maxAge = amis[i].getAge();
        }

        return maxAge;
    }

}
