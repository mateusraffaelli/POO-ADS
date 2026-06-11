package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Segmento {
    private double[] x;
    private double[] y;
    private Color corAtiva;
    private Color corInativa;
    private boolean ligado;

    public Segmento(double[] x, double[] y, Color corAtiva, Color corInativa) {
        this.x = x;
        this.y = y;
        this.corAtiva = corAtiva;
        this.corInativa = corInativa;
        this.ligado = false;
    }

    public void desenhar(Draw desenho) {
        desenho.setPenColor(ligado ? corAtiva : corInativa);
        desenho.filledPolygon(x, y);
    }

    public void ligar()    { this.ligado = true;  }
    public void desligar() { this.ligado = false; }
}