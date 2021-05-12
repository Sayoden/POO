package TP4;

public class Test {

    public static void main(String[] args) {
        Client client = new PersonnePhysique("1",
                "adresse test",
                PersonnePhysique.Genre.HOMME,
                "Goulois",
                "Lucas");

        Commandes commandes = new Commandes("1", client);
        System.out.println(commandes.ajoutArticle(new Article("1",
                "Boisson",
                2,
                10)));

        System.out.println(commandes.ajoutArticle(new Article("1",
                "Boisson",
                2,
                10)));

        System.out.println(commandes.toString());

        System.out.println(commandes.suppressionArticle("1"));

        System.out.println(commandes.toString());

        System.out.println(commandes.ajoutArticle(new Article("1",
                "Boisson",
                2,
                10)));

        System.out.println(commandes.toString());
    }
}
