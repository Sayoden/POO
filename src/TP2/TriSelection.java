package TP2;

public class TriSelection {

    public static int min(Livre[] t, int i){
        int indiceMin = i;
        int indice = i + 1;
        while(indice < t.length){
            if(t[indiceMin].getExemplaires() > t[indice].getExemplaires()){
                indiceMin = indice;
                indice++;
            }
        }
        return indiceMin;
    }

    public static void echanger(Livre[] t, int x, int y){
        Livre tmp = t[x];
        t[x] = t[y];
        t[y] = tmp;
    }

    public static void tri(Livre[] t){
        int indiceMin;
        for(int i = 0; i < t.length; i++){
            indiceMin = min(t,i);
            echanger(t,i,indiceMin);
        }
    }
}
