package TD5;

public class Bouquet {
    private Fleur[] b;
    private Client cl;
    private final static int MAX_FLEURS = 100;

    public Bouquet(Client cl) {
        this.cl = cl;
    }

    public void ajoutFleur(Fleur f, int quantite) throws Exception {
        int tmp = 0;
        if (tmp <= MAX_FLEURS) {
            if (quantite <= 0) {

            } else throw new Exception("La quantité est négative");
            tmp++;
        } else throw new Exception("Le nombre de fleurs est supérieur à 100 !");
    }
}