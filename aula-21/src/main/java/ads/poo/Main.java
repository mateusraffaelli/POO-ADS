package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {
    static void main() throws InterruptedException {


        Draw draw = new Draw();
        draw.setCanvasSize(800,800);
        draw.setYscale(0,800);
        draw.setXscale(0,800);
        draw.enableDoubleBuffering();



//        draw.circle(400,400,300);
//        draw.line(400, 400, 300, 300);
//        draw.line(500, 500, 300, 300);
//
//        draw.setPenColor(Color.RED);
//        draw.filledCircle(400,400,50);
//
//        double[] x = {100,150,250,300};
//        double[] y = {100,150,150,100};
//
//        draw.filledPolygon(x,y);
//
//
//        for (int i = 0; i < 800; i+=5) {
//            draw.line(i, 0, i, 800);
//            draw.line(0,i,800,i);
//        }
//
//        draw.show();
//
//        draw.setFontSize(30);
//
//
        for (int i = 0; i < 10; i++) {
            draw.clear();
            draw.text(400,400, "" + i, 50);
            draw.show();
            TimeUnit.SECONDS.sleep(1);
        }

        draw.setPenColor(Color.RED);
        draw.filledCircle(300,500,100);
        draw.filledCircle(500,500,100);
        draw.filledCircle(400,420,100);
        double[] x = {230,400,400,570};
        double[] y = {430,250,250,430};
        draw.filledPolygon(x,y);
        draw.setPenColor(Color.BLACK);
        draw.text(400,420, "Julie", 50);
        draw.show();

    }
}
