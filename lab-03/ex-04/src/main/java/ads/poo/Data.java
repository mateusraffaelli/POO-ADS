package ads.poo;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private boolean bissexto;

    public Data(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    public Data(int dia){
        mes = 1;
        ano = 1970;
        this.dia = verificadorDia(dia) ? dia : 1;
    }

    public Data(int dia, int mes){
        ano = 1970;
        this.mes = verificadorMes(mes)? mes : 1;
        this.dia = verificadorDia(dia) ? dia : 1;
    }

    public Data(int dia, int mes, int ano){
        this.ano = verificadorAno(ano) ? ano : 1970;
        this.mes = verificadorMes(mes)? mes : 1;
        this.dia = verificadorDia(dia) ? dia : 1;
    }

    private boolean verificadorDia(int dia){
        if (dia < 1 || dia > 31) {
            return false;
        }

        if (mes == 2) {
            return bissexto ? dia <= 29 : dia <= 28;
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30;
        }

        return true;
    }

    private boolean verificadorMes(int mes){
        return mes >= 1 && mes <= 12;
    }

    private boolean verificadorAno(int ano){
        bissexto = isBissexto(ano);
        return ano > 0 && ano < 2027;
    }

    public int getDia(){
        return dia;
    }

    public boolean setDia(int dia){
        this.dia = verificadorDia(dia) ? dia : 1;
        return verificadorDia(dia);
    }

    public int getMes() {
        return mes;
    }

    public boolean setMes(int mes) {
        this.mes = verificadorMes(mes) ? mes : 1;
        return verificadorMes(mes);
    }

    public int getAno() {
        return ano;
    }

    public boolean setAno(int ano) {
        this.ano = verificadorAno(ano) ? ano : 1970;
        return verificadorAno(ano);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%04d" , dia, mes, ano);
    }

    private String converteParaExtenso(int valor){
        return "";
    }

    private String converteParaMes(int valor){
        return "";
    }

    private String verificaNumero(int valor){
        if (converteParaExtenso(valor).isEmpty()){
            if (valor > 31){
                int milhar = (valor/1000)*1000;
                int centena = (valor/1000)*100;
                int desena = (valor/1000)*10;
                int unidade = valor%1000;
                return converteParaExtenso(milhar) + converteParaExtenso(centena) + converteParaExtenso(desena) + " e " + converteParaExtenso(unidade);
            }else{
                int desena = (valor/10)*10;
                int unidade = valor%10;
                return converteParaExtenso(desena) + " e " + converteParaExtenso(unidade);
            }
        }else {
            return converteParaExtenso(valor);
        }
    }

    public String imprimePorExtenso(int valor) {
        String diaEx = verificaNumero(dia);
        String mesEx = converteParaMes(mes);
        String anoEx = verificaNumero(ano);

        return diaEx + " de " + mesEx + " de " + anoEx;
    }

    private int totalDias() {
        int total = 0;

        for (int a = 1; a < this.ano; a++) {
            total += isBissexto(a) ? 366 : 365;
        }

        int[] diasPorMes = {31, isBissexto(this.ano) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int m = 0; m < this.mes - 1; m++) {
            total += diasPorMes[m];
        }

        total += this.dia;

        return total;
    }

    private boolean isBissexto(int ano) {
        if (ano % 400 == 0) return true;
        if (ano % 100 == 0) return false;
        return ano % 4 == 0;
    }

    public int diferencaEntreDatas(Data data) {
        return Math.abs(this.totalDias() - data.totalDias());
    }


}


