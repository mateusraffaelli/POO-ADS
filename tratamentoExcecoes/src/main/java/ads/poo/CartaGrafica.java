package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta {
    protected double x;
    protected double y;

    public CartaGrafica(Valor valor, Naipe naipe, double x, double y) {
        super(valor, naipe);
        this.x = x;
        this.y = y;
    }

    public void desenhar(Draw d){
        d.picture(x,y, "cartas/cartas/" + valor.inicial + naipe.inicial +".png");
        d.show();
    }

    public void clicouDentro(Draw d){
        d.picture(x,y, "cartas/cartas/" + "fundo" + "v" +".png");
        d.show();
    }
}
