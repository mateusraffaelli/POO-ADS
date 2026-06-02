package ads.poo;

import java.time.LocalTime;
import java.util.ArrayList;

public class Relogio {
    private ArrayList<Display> displays = new ArrayList<>();
    private LocalTime horario;
    private int horas;
    private int minutos;
    private int segundos;

    public Relogio(){
        this.horario = LocalTime.now();
        inicializar();
    }

    public Relogio(int hora, int minuto, int segundo){
        this.horario = LocalTime.of(hora, minuto, segundo);
        inicializar();
    }

    public void inicializar() {
        this.horas = horario.getHour();
        this.minutos = horario.getMinute();
        this.segundos = horario.getSecond();
    }

    public void atualizarDisplays(){
        displays.get(0).adicionar(horas/10);
        displays.get(1).adicionar(horas%10);
        displays.get(2).adicionar(minutos/10);
        displays.get(3).adicionar(minutos%10);
        displays.get(4).adicionar(segundos/10);
        displays.get(5).adicionar(segundos%10);

    }

    public void rodar() throws InterruptedException {
        while (true) {
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
            atualizarDisplays();
        }
    }
}
