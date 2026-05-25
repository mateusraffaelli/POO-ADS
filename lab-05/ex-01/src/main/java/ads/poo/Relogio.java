package ads.poo;

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

    public Relogio(){
        this.horario = LocalTime.now();
        adicionando();
    }

    public Relogio(int hora, int minuto, int segundo){
        this.horario = LocalTime.of(hora, minuto, segundo);
        adicionando();
    }

    public void adicionando(){
        this.horas = horario.getHour();
        this.minutos = horario.getMinute();
        this.segundos = horario.getSecond();

        for (int i = 0; i < 6; i++) {
            displays.add(new Display());
        }

        displays.get(0).adicionar(horas/10);
        displays.get(1).adicionar(horas%10);
        displays.get(2).adicionar(minutos/10);
        displays.get(3).adicionar(minutos%10);
        displays.get(4).adicionar(segundos/10);
        displays.get(5).adicionar(segundos%10);
    }


}
