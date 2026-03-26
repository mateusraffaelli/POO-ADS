package ads.poo;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario() {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    public Horario(int hora) {
        validaHora(hora);
    }

    public Horario(int hora, int minuto) {
        validaHora(hora);
        validaMinuto(minuto);
    }

    public Horario(int hora, int minuto, int segundo) {
        validaHora(hora);
        validaMinuto(minuto);
        validaSegundo(segundo);
    }

    private void validaHora(int hora){
        this.hora = hora > 0 && hora <= 24? hora : 0;
    }

    public void validaMinuto(int minuto){
        this.minuto = minuto > 0 && minuto <= 60? minuto : 0;
    }

    public void validaSegundo(int segundo){
        this.segundo = segundo > 0 && segundo <= 60? segundo : 0;
    }

    public boolean setHora(int hora) {
        if (hora > 0 && hora <= 24){
            this.hora = hora;
            return true;
        }else{
            return false;
        }
    }

    public boolean setMinuto(int minuto) {
        if (minuto > 0 && minuto <= 60){
            this.minuto = minuto;
            return true;
        }else{
            return false;
        }
    }

    public boolean setSegundo(int segundo) {
        if (segundo > 0 && segundo <= 60){
            this.segundo = segundo;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora,minuto,segundo);
    }

    private String converteParaExtenso(int valor){
        return switch (valor){
            case 0 -> "zero";
            case 1 -> "um";
            case 2 -> "dois";
            case 3 -> "três";
            case 4 -> "quatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "sete";
            case 8 -> "oito";
            case 9 -> "nove";
            case 10 -> "dez";
            case 11 -> "onze";
            case 12 -> "doze";
            case 13 -> "treze";
            case 14 -> "quatorze";
            case 15 -> "quinze";
            case 16 -> "dezesseis";
            case 17 -> "dezesete";
            case 18 -> "dezoito";
            case 19 -> "dezenove";
            case 20 -> "vinte";
            case 30 -> "trinta";
            case 40 -> "quarenta";
            case 50 -> "cinquenta";
            default -> "";
        };
    }

    private String verificaNumero(int valor){
        if (converteParaExtenso(valor).isEmpty()){
            int desena = (valor/10)*10;
            int unidade = valor%10;
            return converteParaExtenso(desena) + " e " + converteParaExtenso(unidade);
        }else {
            return converteParaExtenso(valor);
        }
    }


    public String imprimePorExtenso(){
        String hEx = verificaNumero(this.hora);
        String mEx = verificaNumero(this.minuto);
        String sEx = verificaNumero(this.segundo);
        return hEx + " horas, " + mEx + " minutos, e " + sEx + " segundos";
    }


    public long getHorarioEmSegundos() {
        return 3600*hora + 60*minuto + segundo;
    }

    public long diferencaEmSegundos(Horario horario){
        return this.getHorarioEmSegundos() - horario.getHorarioEmSegundos();
    }
}
