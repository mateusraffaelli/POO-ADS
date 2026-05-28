package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;

public class Relogio {
    private ArrayList<Display> displays = new ArrayList<>();
    private LocalTime horario;
    private int horas;
    private int minutos;
    private int segundos;

    private Draw desenho;
    private static final double FATOR  = 60;
    private static final double ESPACO = FATOR * 1.6;
    private static final Color CLARA  = Draw.GREEN;
    private static final Color  ESCURA = new Color(0, 40, 0);

    public Relogio(){
        this.horario = LocalTime.now();
        inicializar();
    }

    public Relogio(int hora, int minuto, int segundo){
        this.horario = LocalTime.of(hora, minuto, segundo);
        inicializar();
    }

    public void inicializar(){
        this.horas = horario.getHour();
        this.minutos = horario.getMinute();
        this.segundos = horario.getSecond();

        desenho = new Draw();
        desenho.setCanvasSize(800, 300);
        desenho.setXscale(0, 800);
        desenho.setYscale(0, 300);
        desenho.enableDoubleBuffering();

        double[] posX = {
                30,
                30 + ESPACO,
                30 + ESPACO * 2 + 30,
                30 + ESPACO * 3 + 30,
                30 + ESPACO * 4 + 60,
                30 + ESPACO * 5 + 60
        };

        for (double x : posX) {
            displays.add(new Display(x, 60, FATOR, CLARA, ESCURA));
        }
    }

    public void atualizarDisplays(){
            displays.get(0).adicionar(horas/10);
            displays.get(1).adicionar(horas%10);
            displays.get(2).adicionar(minutos/10);
            displays.get(3).adicionar(minutos%10);
            displays.get(4).adicionar(segundos/10);
            displays.get(5).adicionar(segundos%10);

    }

    private void desenharDoisPontos(double x, double y) {
        desenho.setPenColor(CLARA);
        desenho.filledCircle(x, y + FATOR * 0.7, FATOR * 0.12);
        desenho.filledCircle(x, y + FATOR * 1.4, FATOR * 0.12);
    }

    public void rodar() throws InterruptedException {
        while (true) {
            segundos++;
            if (segundos > 59){
                segundos = 0;
                minutos++;
            }
            if (minutos > 59){
                minutos = 0;
                horas++;
            }
            if (horas > 23){
                horas = 0;
            }

            atualizarDisplays();

            desenho.clear(Draw.BLACK);
            for (Display d : displays) d.desenhar(desenho);
            desenharDoisPontos(30 + ESPACO * 2 + 10, 60);
            desenharDoisPontos(30 + ESPACO * 4 + 40, 60);
            desenho.show();

            Thread.sleep(1000);
        }

    }
}
