package ads.poo;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class App implements DrawListener {
    private static ArrayList<CartaGrafica> cartas = new ArrayList<>();

    private Draw draw;
    ArrayList<Objects> elementos = new ArrayList<>();
    DadoGrafico dado = new DadoGrafico(300, 300);

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


        for(CartaGrafica c : cartas){
            c.desenhar(this.draw);
        }

        draw.show();

    }




    @Override
    public void mouseClicked(double x, double y) {
        if (cartas.get(0).clicouDentro(x,y)){
            cartas.get(0).desenhar(this.draw);
            draw.show();
        }else {
            System.out.println(Arrays.toString(dado.est));
            dado.clicouDentro(x,y);
            dado.desenhar(this.draw);
            draw.show();
        }

    }

    static void main(String[] args) {
        App app = new App();
    }
}
