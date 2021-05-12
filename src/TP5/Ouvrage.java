package TP5;

public interface Ouvrage extends Document, TroisD{

    void nbPages(int nbPages);

    boolean disponible();

    int nbExemplaires();
}
