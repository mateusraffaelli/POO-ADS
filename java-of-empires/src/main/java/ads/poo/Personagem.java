package ads.poo;

public abstract class Personagem {
    private double vida;
    private double ataque;
    private double velocidade;

    public Personagem(double vida, double ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public abstract String mover();

    @Override
    public String toString() {
        return "\nVida: " + vida +
                "\nAtaque: " + ataque +
                "\nVelocidade: " + velocidade;
    }
}
