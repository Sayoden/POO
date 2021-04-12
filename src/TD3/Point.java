package TD3;

public class Point {
    //deux attributs de type int
    double abscisse;
    double ordonnee;
    //constructeur

    public double getAbscisse(){
        return abscisse;
    }

    public double getOrdonnee(){
        return ordonnee;
    }
    Point(double v) {
        abscisse=0;
        ordonnee=0;
    }

    //methode permettant de changer les coordonnées d'un point
    void set(double u, double v){
        abscisse=u;
        ordonnee=v;
    }

    //methode permettant de translater un point
    void translate(double u, double v){
        abscisse=abscisse+u;
        ordonnee=ordonnee+v;
    }

    public void affiche(){
        System.out.println("On a l'abscisse : "+abscisse+" et l'ordonnée: "+ordonnee);
    }

    public boolean origine(Point p){
        return p.abscisse ==abscisse && p.ordonnee==ordonnee;
    }

    public Point(double u, double v){
        abscisse=u;
        ordonnee=v;
    }

    public void set(Point p){
        abscisse=p.abscisse;
        ordonnee=p.ordonnee;
    }

    public Point symetrie(){
        return new Point(-1*abscisse,-1*ordonnee);
    }

    public class Paire{
        int a;
        int b;

        public Paire(){
            a=0;
            b=0;
        }

        public Paire(int u,int v){
            a = u;
            b = v;
        }

        private Paire(Paire p){
            a = p.a;
            b = p.b;
        }

    }
}
