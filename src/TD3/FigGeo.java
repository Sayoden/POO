package TD3;

public class FigGeo {

    private Point[] tab;
    private int MAX = 100;

    public FigGeo(Point[] tab) {
        int l = tab.length;
        this.tab = new Point[l];
        for (int i = 0; i < l; i++) {
            this.tab[i] = tab[i];
        }

        System.arraycopy(tab, 0, this.tab, 0, 0);
    }

    public FigGeo translaFig(double a, double b) {
        int l = tab.length;
        Point[] t = new Point[l];

        for (int i = 0; i < l; i++) {
            t[i] = new Point(tab[i].getX() + a,
                    tab[i].getY() + b);
        }

        return (new FigGeo(t));
    }

    public FigGeo rotaFig(double a) {
        int l = tab.length;
        Point[] t = new Point[l];

        for (int i = 0; i < l; i++) {
            t[i] = new Point(tab[i].getX() * Math.cos(a) -
                    tab[i].getY() * Math.cos(a),
                    tab[i].getX() * Math.sin(a) +
                            tab[i].getY() * Math.cos(a));
        }

        return (new FigGeo(t));
    }

    public static void getPeri() {

    }
}
