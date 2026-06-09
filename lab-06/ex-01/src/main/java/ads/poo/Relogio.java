package ads.poo;

import java.time.LocalTime;
import java.util.ArrayList;

public class Relogio {
    private LocalTime horario;
    protected int horas;
    protected int minutos;
    protected int segundos;

    public Relogio(){
        this.horario = LocalTime.now();
        inicializar();
    }

    public Relogio(int hora, int minuto, int segundo){
        this.horario = LocalTime.of(hora, minuto, segundo);
        inicializar();
    }

    protected void inicializar() {
        this.horas = horario.getHour();
        this.minutos = horario.getMinute();
        this.segundos = horario.getSecond();
    }

    public void rodar() throws InterruptedException {
        segundos++;
        if (segundos > 59) {
            segundos = 0;
            minutos++;
        }
        if (minutos > 59) {
            minutos = 0;
            horas++;
        }
        if (horas > 23) {
            horas = 0;

        }
    }
}
