package TD4;

public class Client {

    private String papeterie, ville, siret;
    private double ristoune;

    public void setRistoune(double r) throws Exception {
        if (r >= 0 && r <= 1) {
            this.ristoune = r;
        } else {
            throw new Exception();
        }
    }
}
