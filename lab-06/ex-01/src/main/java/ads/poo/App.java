package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws InterruptedException {
        RelogioDigital relogioDigital = new RelogioDigital();
        Relogio relogio = new Relogio(05, 12, 11) {
            @Override
            public void rodar(Draw desenho) throws InterruptedException {

            }
        };

        relogioDigital.rodar();


        RelogioAnalogico relogioAnalogico = new RelogioAnalogico();
        relogioAnalogico.rodar();

        Draw desenho = new Draw();
        desenho.setCanvasSize(800, 800);
        desenho.setXscale(0, 800);
        desenho.setYscale(0, 800);

        while (true){
            desenho.enableDoubleBuffering();
            relogioDigital.rodar();
            relogioAnalogico.rodar();

//            desenho.show();
//            desenho.clear();

        }

        // Toda ação de desenho acontecerá em um buffer secundário
       // e esse buffer só será visto depois que for invocado o método show()

    }
}