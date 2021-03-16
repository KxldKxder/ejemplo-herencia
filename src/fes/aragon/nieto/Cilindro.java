package fes.aragon.nieto;

import fes.aragon.hijo.Circulo;
import java.awt.Point;

public class Cilindro extends Circulo{
    private int altura;

    public Cilindro(int altura, Point centro) {
        super(centro);
        this.altura = altura;
    }

    public Cilindro(int altura, Point centro, Point punto) {
        super(centro, punto);
        this.altura = altura;
    }

    public Cilindro(int altura, Point centro, int x, int y) {
        super(centro, x, y);
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
}
