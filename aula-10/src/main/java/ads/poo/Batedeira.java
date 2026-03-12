package ads.poo;

public class Batedeira {
    private double potencia;
    private double velocidade;

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    public double tempoParaBater(int energiaUtilizada){
        return energiaUtilizada/potencia*velocidade;
    }
}
