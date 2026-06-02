package ads.poo;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        RelogioDigital relogio = new RelogioDigital();
        relogio.rodar();
        RelogioDigital relogioManual = new RelogioDigital(22, 56, 49);
        relogioManual.rodar();



    }
}