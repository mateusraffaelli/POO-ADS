package ads.poo;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class Relogio {
    private ArrayList<Display> displays = new ArrayList<>();
    public LocalDateTime horario;

    public Relogio(){
        this.horario = LocalDateTime.now();

    }

    public Relogio(int ano, Month mes, int dia, int hora, int minuto, int segundo){
        this.horario = LocalDateTime.of(ano, mes, dia, hora, minuto);

        for (int i = 0; i < 6; i++) {
            displays.add(new Display());
        }

        displays.get(0).adicionar(hora);
        displays.get(1).adicionar(hora);
        displays.get(2).adicionar(minuto);
        displays.get(3).adicionar(minuto);
        displays.get(4).adicionar(segundo);
        displays.get(5).adicionar(segundo);
    }


}
