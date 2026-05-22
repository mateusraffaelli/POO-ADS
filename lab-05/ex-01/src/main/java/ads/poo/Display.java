package ads.poo;

import java.awt.*;
import java.util.ArrayList;

public class Display {
    private ArrayList<Segmento> segmentos = new ArrayList<>();

    public Display(){
        segmentos.add(new Segmento(new double[1],new double[1],new Color(0, 0,0)));
        segmentos.add(new Segmento(new double[1],new double[1],new Color(0, 0,0)));
        segmentos.add(new Segmento(new double[1],new double[1],new Color(0, 0,0)));
        segmentos.add(new Segmento(new double[1],new double[1],new Color(0, 0,0)));
        segmentos.add(new Segmento(new double[1],new double[1],new Color(0, 0,0)));
        segmentos.add(new Segmento(new double[1],new double[1],new Color(0, 0,0)));
        segmentos.add(new Segmento(new double[1],new double[1],new Color(0, 0,0)));

        for (int i = 0; i < 6; i++) {
            segmentos.get(i).desligar();
        }
    }

    public void adicionar(int numero){
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
                segmentos.get(1).ligar();
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
}
