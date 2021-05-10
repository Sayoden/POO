package TD4;

import TD4.exceptions.PrixException;
import lombok.Getter;

public class LigneCmd {

    @Getter
    private Crayon cr;

    @Getter
    private int quantite;

    public LigneCmd(Crayon cr, int quantite) throws Exception{
        this.cr = cr;
        if (quantite <= 0) {
            throw new Exception();
        } else {
            this.quantite = quantite;
        }
    }


}
