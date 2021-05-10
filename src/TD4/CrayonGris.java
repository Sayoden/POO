package TD4;

import TD4.exceptions.ColorException;
import TD4.exceptions.PrixException;
import lombok.Getter;

import java.awt.*;

public class CrayonGris extends Crayon {

    @Getter
    private String typeMine;

    public CrayonGris(double prix, String marque, String typeMine) throws Exception {
        super(marque, prix);
        this.typeMine = typeMine;
    }

    @Override
    public String affichageCrayon() {
        return super.affichageCrayon() + " " + this.typeMine;
    }
}
