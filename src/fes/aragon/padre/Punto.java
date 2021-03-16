package fes.aragon.padre;

import java.awt.Point;

public class Punto {

    private Point punto;

    public Punto(int x, int y) {
        punto = new Point(x, y);
    }

    public Punto() {
        punto = new Point();
    }

    public Punto(Point punto) {
        this.punto = punto;
    }

    public Point getPunto() {
        return punto;
    }

    public void setPunto(Point punto) {
        this.punto = punto;
    }

}
