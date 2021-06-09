package TP1.Exercice6;

import lombok.Getter;

@Getter
public class Complexe {

    private double reel;
    private double imaginaire;

    Complexe(double r, double i){
        this.reel = r;
        this.imaginaire = i;
    }

    public static void main(String[] args){
        Complexe c1=new Complexe(2,1);
        Complexe c2=new Complexe(4,6.5);
        Complexe somme=LibComplexe.sum(c1,c2);
        Complexe produit=LibComplexe.produit(c1,c2);
        LibComplexe.afficher(somme);
        LibComplexe.afficher(produit);
    }

}
