package ads.poo;

public class Motor {
    private int hp;
    private  int giroAtual;
    private int cilindros;

    public Motor(){
        this.hp = 144;
        this.cilindros = 4;
        this.giroAtual = 0;
    }

    public void acelerar(int v){
        giroAtual ++;
    }
}
