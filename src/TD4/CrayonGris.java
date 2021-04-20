package TD4;

import TD4.exceptions.ColorException;
import TD4.exceptions.PrixException;

import java.awt.*;

public class CrayonGris extends Crayon{

    private Color color;
    private MineType mineType;

    public CrayonGris(String marque, double prix, Color color, MineType mineType) throws PrixException, ColorException {
        super(marque, prix);
        if (color.equals(Color.GRAY)) {
            this.color = color;
            this.mineType = mineType;
        } else {
            throw new ColorException("La couleur choisie n'est pas la bonne");
        }
    }

    public Color getColor() {
        return color;
    }

    public MineType getMineType() {
        return mineType;
    }

    public void setColor(Color color) throws ColorException{
        if (color.equals(Color.GRAY)) {
            this.color = color;
        } else {
            throw new ColorException("La couleur définie n'est pas la bonne");
        }
    }

    public void setMineType(MineType mineType) {
        this.mineType = mineType;
    }

    @Override
    public String affichageCrayon() {
        return super.affichageCrayon() + ",Couleur: " + this.color + ",Type de mine: " + mineType.name();
    }
}
