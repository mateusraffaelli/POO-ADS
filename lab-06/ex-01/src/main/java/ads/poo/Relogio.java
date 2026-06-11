package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.time.LocalTime;
import java.util.ArrayList;

public class Relogio {
    private LocalTime horario;
    protected int horas;
    protected int minutos;
    protected int segundos;

    public Relogio() {
        this.horario = LocalTime.now();
        inicializar();
    }

    public Relogio(int hora, int minuto, int segundo) {
        this.horario = LocalTime.of(hora, minuto, segundo);
        inicializar();
    }

    protected void inicializar() {
        this.horas = horario.getHour();
        this.minutos = horario.getMinute();
        this.segundos = horario.getSecond();
    }

}
