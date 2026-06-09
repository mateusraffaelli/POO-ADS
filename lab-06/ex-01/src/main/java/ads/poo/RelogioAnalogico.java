package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class RelogioAnalogico extends Relogio {
    private Draw draw;

    // CORES
    private static final Color corFundo = Draw.LIGHT_GRAY;
    private static final Color corRelogio = Draw.WHITE;
    private static final Color corTracos = Draw.BLACK;
    private static final Color corSegundos = Draw.RED;

    // Centro do relógio
    private double centroX = 0.5;
    private double centroY = 0.5;

    // Raio do círculo do relógio
    private double raioRelogio = 0.2;

    // Proporções relativas ao raio do relógio
    private double comprimentoPonteiroSegundo = raioRelogio * 0.8;
    private double comprimentoPonteiroHora = raioRelogio * 0.5;
    private double raioInicioTraco = raioRelogio * 0.85;
    private double raioFimTraco = raioRelogio * 0.95;
    private double espessuraTraco = raioRelogio * 0.05;
    private double espessuraSegundo = raioRelogio * 0.025;

    // Quantidade de traços (horas)
    private int tracosDasHoras = 12;
    private double anguloEntreTracos = 30.0; // graus, pois 360° / 12 = 30°


    public RelogioAnalogico() {
        super.inicializar();
    }

    @Override
    protected void inicializar() {
        super.inicializar();
        draw = new Draw();
        draw.enableDoubleBuffering();

        // Para finalizar a aplicação ao clicar no fechar da janela
        draw.setDefaultCloseOperation(3);

    }

    @Override
    public void rodar() throws InterruptedException {
        while (true){
            super.rodar();
            draw.clear(corFundo);
            draw.setPenColor(corRelogio);
            draw.filledCircle(centroX, centroY, raioRelogio);
            draw.setPenColor(corTracos);
            draw.setPenRadius(espessuraTraco);

            for (int traco = 0; traco < tracosDasHoras; traco++) {
                double angulo = Math.toRadians(anguloEntreTracos * traco);
                draw.line(
                        centroX + raioFimTraco * Math.sin(angulo), centroY + raioFimTraco * Math.cos(angulo),
                        centroX + raioInicioTraco * Math.sin(angulo), centroY + raioInicioTraco * Math.cos(angulo)
                );
            }

            double anguloHora = Math.toRadians(anguloEntreTracos * horas); // 360° / 12 = 30° por hora
            double anguloMinuto = Math.toRadians(6 * minutos); // 360° / 60 = 6° por minuto
            double anguloSegundo = Math.toRadians(6 * segundos); // 360° / 60 = 6° por segundo

            // Ponteiro das horas
            draw.line(centroX, centroY, centroX + comprimentoPonteiroHora * Math.sin(anguloHora), centroY +
                    comprimentoPonteiroHora * Math.cos(anguloHora));

            // Ponteiro dos minutos
            draw.line(centroX, centroY, centroX + comprimentoPonteiroSegundo * Math.sin(anguloMinuto), centroY +
                    comprimentoPonteiroSegundo * Math.cos(anguloMinuto));

            // Ponteiro dos segundos
            draw.setPenColor(corSegundos);
            draw.setPenRadius(espessuraSegundo);
            draw.line(centroX, centroY, centroX + comprimentoPonteiroSegundo * Math.sin(anguloSegundo), centroY +
                    comprimentoPonteiroSegundo * Math.cos(anguloSegundo));
            draw.show();
            TimeUnit.SECONDS.sleep(1);
        }

    }
}
