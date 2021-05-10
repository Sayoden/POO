package TD4;

import TD4.exceptions.PrixException;

import java.util.Vector;

public class Cmd {

    private static int incRef = 1;

    private int reference;
    private Client client;
    private String date;
    private Vector<LigneCmd> lignes;

    public Cmd(Client client, String date) {
        reference = incRef;
        incRef++;
        this.client = client;
        this.date = date;
        this.lignes = new Vector<>();
    }

    public void ajoutLigne(Crayon crayon, int quantite) throws Exception {
        lignes.add(new LigneCmd(crayon, quantite));
    }

    public void modifLigne(int indice, Crayon crayon, int quantite) throws Exception {
        if (indice > lignes.size()) {
            throw new Exception();
        } else {
            lignes.set(indice, new LigneCmd(crayon, quantite));
        }
    }

    public void calculeTotal() {
        int prixTotal = 0;
        this.lignes.forEach(ligne -> {
            //ligne.getCr()
        });
    }

    @Override
    public String toString() {
        return "Cmd{" +
                "reference=" + reference +
                ", client=" + client +
                ", date='" + date + '\'' +
                ", lignes=" + lignes +
                '}';
    }
}
