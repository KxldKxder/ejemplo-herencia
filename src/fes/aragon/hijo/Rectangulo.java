package fes.aragon.hijo;

import fes.aragon.padre.Punto;
import java.awt.Point;

public class Rectangulo extends Punto {

    private int ancho;
    private int alto;

    public Rectangulo(int ancho, int alto) {
        super();
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo(int ancho, int alto, int x, int y) {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo(int ancho, int alto, Point punto) {
        super(punto);
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

}
