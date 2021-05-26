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

    public void modifLigne(int indice, Crayon crayon, int quantite) throws Exception{
        LigneCmd l = new LigneCmd(lignes.elementAt(indice).getCr(), quantite);
        lignes.set(indice, l);
    }

    public double calculeTotal() {
        double prixTotal = this.lignes.stream()
                .mapToDouble(ligne -> ligne.getCr().getPrix() * ligne.getQuantite()).sum();
        return prixTotal - (client.getRistoune() * prixTotal);
    }

    @Override
    public String toString() {
       StringBuffer sb = new StringBuffer("Reference: " + this.reference + "\n Client: " + client.toString() + "\n Date: " + date);

       for (LigneCmd l : lignes) {
           sb.append(l.toString()).append("\n");
       }

       return new String(sb);
    }
}
