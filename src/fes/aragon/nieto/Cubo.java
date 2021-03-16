package fes.aragon.nieto;

import fes.aragon.hijo.Rectangulo;
import java.awt.Point;

public class Cubo extends Rectangulo {

    private int altura;

    public Cubo(int altura, int ancho, int alto) {
        super(ancho, alto);
        this.altura = altura;
    }

    public Cubo(int altura, int ancho, int alto, Point punto) {
        super(ancho, alto, punto);
        this.altura = altura;
    }

    public Cubo(int altura, int ancho, int alto, int x, int y) {
        super(ancho, alto, x, y);
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}
