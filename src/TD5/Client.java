package TD5;

import lombok.Getter;

public class Client {

    @Getter
    private String nom;

    @Getter
    private String prenom;

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}
