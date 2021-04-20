package TD4;

import TD4.exceptions.ColorException;
import TD4.exceptions.PrixException;

import java.awt.*;

public class CrayonTest {

    public static void main(String[] args) {
        try{
            Crayon crayon = new Crayon("dadza", 6);
            crayon.setPrix(100);

            CrayonGris crayonGris = new CrayonGris("", 6, Color.GRAY, MineType.HB);
        } catch (PrixException | ColorException e) {
            e.printStackTrace();
        }
    }
}
