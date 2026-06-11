package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta implements ElementGrafico{
    protected double x;
    protected double y;
    private boolean virada;

    public CartaGrafica(Valor valor, Naipe naipe, double x, double y) {
        super(valor, naipe);
        this.x = x;
        this.y = y;
    }

    public void desenhar(Draw d){
        if (virada){
            d.picture(x,y, "cartas/cartas/fundoa.png");
        }else{
            d.picture(x,y, "cartas/cartas/" + valor.inicial + naipe.inicial +".png");
        }
    }

    public boolean clicouDentro (double x, double y){
        if (x <= this.x + 36 && x >= this.x - 36 && x <= this.y + 48 && x >= this.y - 48){
            virada =! virada;
            return true;
        }else{
            return false;
        }
    }
}
