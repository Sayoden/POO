package TPSUP1;

import java.util.Calendar;
import java.util.Date;

public class DemoTp4 {

    public static void main(String[] args){
        Date date = new Date();
        date.setYear(2002);
        date.setMonth(Calendar.AUGUST);
        date.setDate(23);
        Personne personne = new Personne("Goulois", "Lucas", "Française", date, 18, 188, 600, "", true, "Auchel");

        personne.afficher();
    }
}
