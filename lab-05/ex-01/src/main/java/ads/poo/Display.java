package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.ArrayList;

public class Display {
    private ArrayList<Segmento> segmentos = new ArrayList<>();

    public Display(double x, double y, double fator, Color clara, Color escura){
        segmentos.add(criarHorizontal(x, y + fator * 2, fator, clara, escura)); // 0 topo
        segmentos.add(criarVertical  (x + fator, y + fator, fator, clara, escura)); // 1 sup.dir
        segmentos.add(criarVertical  (x + fator, y,         fator, clara, escura)); // 2 inf.dir
        segmentos.add(criarHorizontal(x, y,                 fator, clara, escura)); // 3 base
        segmentos.add(criarVertical  (x, y,                 fator, clara, escura)); // 4 inf.esq
        segmentos.add(criarVertical  (x, y + fator,         fator, clara, escura)); // 5 sup.esq
        segmentos.add(criarHorizontal(x, y + fator,         fator, clara, escura)); // 6 meio

        for (int i = 0; i < 6; i++) {
            segmentos.get(i).desligar();
        }
    }

    private Segmento criarHorizontal(double x, double y, double f, Color clara, Color escura) {
        double[] xs = {0.1*f+x, 0.2*f+x, 1.0*f+x, 1.1*f+x, 1.0*f+x, 0.2*f+x};
        double[] ys = {0.2*f+y, 0.3*f+y, 0.3*f+y, 0.2*f+y, 0.1*f+y, 0.1*f+y};
        return new Segmento(xs, ys, clara, escura);
    }

    private Segmento criarVertical(double x, double y, double f, Color clara, Color escura) {
        double[] xs = {0.1*f+x, 0.2*f+x, 0.2*f+x, 0.1*f+x, 0.0*f+x, 0.0*f+x};
        double[] ys = {0.2*f+y, 0.3*f+y, 1.0*f+y, 1.1*f+y, 1.0*f+y, 0.3*f+y};
        return new Segmento(xs, ys, clara, escura);
    }

    public void adicionar(int numero){
        for (int i = 0; i <= 6; i++) {
            segmentos.get(i).desligar();
        }

        switch (numero){
            case 0 -> {
                segmentos.get(0).ligar();
                segmentos.get(1).ligar();
                segmentos.get(2).ligar();
                segmentos.get(3).ligar();
                segmentos.get(4).ligar();
                segmentos.get(5).ligar();
            }
            case 1 -> {
                segmentos.get(1).ligar();
                segmentos.get(2).ligar();
            }
            case 2 ->{
                segmentos.get(0).ligar();
                segmentos.get(1).ligar();
                segmentos.get(3).ligar();
                segmentos.get(4).ligar();
                segmentos.get(6).ligar();
            }
            case 3 ->{
                segmentos.get(0).ligar();
                segmentos.get(1).ligar();
                segmentos.get(2).ligar();
                segmentos.get(3).ligar();
                segmentos.get(6).ligar();
            }
            case 4 ->{
                segmentos.get(1).ligar();
                segmentos.get(2).ligar();
                segmentos.get(5).ligar();
                segmentos.get(6).ligar();
            }
            case 5 ->{
                segmentos.get(0).ligar();
                segmentos.get(2).ligar();
                segmentos.get(3).ligar();
                segmentos.get(5).ligar();
                segmentos.get(6).ligar();
            }
            case 6 ->{
                segmentos.get(0).ligar();
                segmentos.get(2).ligar();
                segmentos.get(3).ligar();
                segmentos.get(4).ligar();
                segmentos.get(5).ligar();
                segmentos.get(6).ligar();
            }
            case 7 ->{
                segmentos.get(0).ligar();
                segmentos.get(1).ligar();
                segmentos.get(2).ligar();
            }
            case 8 ->{
                segmentos.get(0).ligar();
                segmentos.get(1).ligar();
                segmentos.get(2).ligar();
                segmentos.get(3).ligar();
                segmentos.get(4).ligar();
                segmentos.get(5).ligar();
                segmentos.get(6).ligar();
            }
            case 9 ->{
                segmentos.get(0).ligar();
                segmentos.get(1).ligar();
                segmentos.get(2).ligar();
                segmentos.get(3).ligar();
                segmentos.get(5).ligar();
                segmentos.get(6).ligar();
            }
        }

    }

    public void desenhar(Draw desenho) {
        for (Segmento s : segmentos) s.desenhar(desenho);
    }
}
