package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class DadoGrafico extends Dado implements ElementGrafico{
    protected double x;
    protected double y;

    public DadoGrafico(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void desenhar(Draw d){
        d.picture(x,y, "dados/" + (face + 1) + ".png");
        d.show();
    }

    public boolean clicouDentro (double x, double y){
        if (x <= this.x + 25 && x >= this.x - 25 && x <= this.y + 25 && x >= this.y - 25){
            jogar();
            return true;
        }else{
            return false;
        }
    }

}
