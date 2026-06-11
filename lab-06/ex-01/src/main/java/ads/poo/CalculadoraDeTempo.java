package ads.poo;

public interface CalculadoraDeTempo {
     int horas;
     int minutos;
     int segundos;

    public void incrementa(){
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

    public void decrementa(){
        segundos--;
        if (segundos < 0) {
            segundos = 59;
            minutos--;
        }
        if (minutos < 0) {
            minutos = 59;
            horas--;
        }
    }

}
