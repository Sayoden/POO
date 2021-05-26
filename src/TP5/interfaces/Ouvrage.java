package TP5.interfaces;

public interface Ouvrage extends Document, TroisD{

    void nbPages(int nbPages) throws Exception;

    boolean disponible();

    int nbExemplaires();
}
