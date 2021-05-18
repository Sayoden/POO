package TD4;

import lombok.Getter;

public class Client {

    private String papeterie, ville, siret;

    @Getter
    private double ristoune;

    public void setRistoune(double r) throws Exception {
        if (r >= 0 && r <= 1) {
            this.ristoune = r;
        } else {
            throw new Exception();
        }
    }
}
