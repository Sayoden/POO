package TD3;

public class Quadrilatere extends FigureGeometrique{

    public Quadrilatere(Point p1, Point p2, Point p3, Point p4) {
        super(new Point[]{p1, p2, p3, p4});
    }

    public Quadrilatere(Point p1, Point p2, Point p3) {
        super(new Point[]{p1, p2, p3});
    }

    public class Rectangle extends Quadrilatere{

        public Rectangle(Point p1, Point p2, Point p3) {
            super(p1, p2, p3, new Point(p3.getAbscisse() + p1.getAbscisse() - p2.getAbscisse(),
                    p3.getOrdonnee() + p1.getOrdonnee() - p2.getOrdonnee()));
        }

        @Override
        public double perimetre() {
            return super.distance(getTab()[0], getTab()[1]) +
                    super.distance(getTab()[1], getTab()[0]) * 2;
        }
    }

    public class Carre extends Quadrilatere{

        public Carre(Point p1, Point p2, Point p3) {
            super(p1, p2, p3);
        }

        @Override
        public double perimetre() {
            return super.distance(getTab()[0], getTab()[1]) * 4;
        }


    }
}
