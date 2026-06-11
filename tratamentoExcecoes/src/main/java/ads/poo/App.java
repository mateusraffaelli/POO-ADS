package ads.poo;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.ArrayList;
import java.util.Random;

public class App implements DrawListener {
    private static ArrayList<CartaGrafica> cartas = new ArrayList<>();

    private Draw draw;

    public App(){
        this.draw = new Draw();
        this.draw.setTitle("Jogo de cartas");
        this.draw.setCanvasSize(1200, 600);
        this.draw.setXscale(0, 1200);
        this.draw.setYscale(0, 600);
        this.draw.setDefaultCloseOperation(3);
        this.draw.enableDoubleBuffering();
        this.draw.addListener(this);

        cartas.add(new CartaGrafica(Valor.AS, Naipe.COPAS, 100, 100));
        cartas.add(new CartaGrafica(Valor.CINCO, Naipe.COPAS, 200, 200));

    }

    @Override
    public void mouseClicked(double x, double y) {
        if (x == cartas.get(0).x && y == cartas.get(0).y){
            cartas.get(0).clicouDentro(draw);
        }

        for (int i = 0; i < 2; i++) {
            cartas.get(i).desenhar(draw);
        }


    }

    static void main(String[] args) {
        App app = new App();
    }
}
