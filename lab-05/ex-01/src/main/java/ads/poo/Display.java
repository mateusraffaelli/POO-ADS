package ads.poo;

import java.util.ArrayList;

public class Display {
    private ArrayList<Segmento> segmentos = new ArrayList<>();

    public void adicionar(int numero){
//        segmentos.add(new Segmento());
//        segmentos.add(new Segmento());
//        segmentos.add(new Segmento());
//        segmentos.add(new Segmento());
//        segmentos.add(new Segmento());
//        segmentos.add(new Segmento());
//        segmentos.add(new Segmento());

        switch (numero){
            case 1 -> {
                segmentos.get(0).desligar();
                segmentos.get(1).ligar();
                segmentos.get(1).ligar();
                segmentos.get(2).desligar();
                segmentos.get(3).desligar();
                segmentos.get(4).desligar();
                segmentos.get(5).desligar();
                segmentos.get(6).desligar();
            }
            case 2 ->{

            }
            case 3 ->{

            }
            case 4 ->{

            }
            case 5 ->{

            }
            case 6 ->{

            }
            case 7 ->{

            }
            case 8 ->{

            }
            case 9 ->{

            }
        }

    }
}
