package TP5.interfaces;

public interface Ouvrage extends Document, TroisD{

    void nbPages(int nbPages);

    boolean disponible();

    int nbExemplaires();
}
