package fes.aragon.hijo;

import fes.aragon.padre.Punto;
import java.awt.Point;

public class Circulo extends Punto {

    private Point centro;
    
    public Circulo(Point centro) {
        super();
        this.centro = centro;
    }

    public Circulo(Point centro, Point punto) {
        super(punto);
        this.centro = centro;
    }

    public Circulo(Point centro, int x, int y) {
        super(x, y);
        this.centro = centro;
    }

    public Point getCentro() {
        return centro;
    }

    public void setCentro(Point centro) {
        this.centro = centro;
    }

}
