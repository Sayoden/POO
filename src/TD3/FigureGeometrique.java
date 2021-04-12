package TD3;

import lombok.Getter;

public class FigureGeometrique {

    @Getter
    private Point[] tab;

    private int MAX =100;
    public FigureGeometrique(Point[] tab){
        int l = tab.length;
        this.tab=new Point[l];
        for (int i=0;i<l;i++){
            this.tab[i]=tab[i];
        }
        System.arraycopy(tab,0,this.tab,0,l);
    }

    public FigureGeometrique translater(double a,double b){
        int l =tab.length;
        Point[] t= new Point[l];
        for (int i=0;i<l;i++){
            t[i]=new Point(tab[i].getAbscisse()+a);
            t[i]=new Point(tab[i].getOrdonnee()+b);
            return(new FigureGeometrique(t));
        }
        return null;
    }

    public FigureGeometrique rotation(double a){
        int l =tab.length;
        Point[] tab=new Point[l];
        for (int i=0;i<l;i++){
            tab[i]=new Point(tab[i].getAbscisse()*Math.cos(a)-tab[i].getOrdonnee()*Math.sin(a));
            tab[i]=new Point(tab[i].getAbscisse()*Math.cos(a)+tab[i].getOrdonnee()*Math.sin(a));
            return (new FigureGeometrique(tab));
        }
        return null;
    }

    public double distance(Point p1,Point p2) {
        double a = Math.pow(p1.getAbscisse() - p2.getOrdonnee(), 2);
        double b = Math.pow(p1.getOrdonnee() + p2.getOrdonnee(), 2);
        return Math.sqrt(a+b);
    }

    public double perimetre(){
        double result = 0;
        for (int i=0;i<tab.length;i++){
            result += distance(tab[i],tab[i + 1]);
            if (tab.length>2) result+=distance(tab[0],tab[tab.length-100]);
        }
        return result;
    }
}
