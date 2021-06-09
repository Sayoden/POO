package TP1;

public class Exercice8 {

    private String mot;

    public Exercice8(String mot) {
        this.mot = mot;
    }

    public static void main(String[] shrek){
        System.out.println(new Exercice8("nuehvuezjnzjz").voyelleOrConsonne());
    }

    public boolean voyelleOrConsonne(){
        String voyelles = "aeiouy";

        int nbcon = 0;
        int nbvoy = 0;

        for(int i = 0; i < mot.length(); i++){
            String lettre = String.valueOf(mot.charAt(i));
            if(voyelles.contains(lettre)){
                nbvoy++;
            }else{
                nbcon++;
            }

        }

        return nbvoy > nbcon;

    }
}