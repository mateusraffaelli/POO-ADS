package ads.poo;

public class Contador {
    private int valorAtual;

    public void atribuirValor(int valor){
        valorAtual = valor;
    }

    public void incrementarEmUm(){
        valorAtual ++;
    }

    public int getValorAtual(){
        return valorAtual;
    }

}
