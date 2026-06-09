package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta {
    private double x;
    private double y;

    public CartaGrafica(Valor valor, Naipe naipe, double x, double y) {
        super(valor, naipe);
        this.x = x;
        this.y = y;
    }

    public void desenhar(Draw d){
        d.picture(x,y, "cartas/cartas/" + valor.inicial + naipe.inicial +".png");
        d.show();
    }

    public void clicouDentro(){

    }
}
