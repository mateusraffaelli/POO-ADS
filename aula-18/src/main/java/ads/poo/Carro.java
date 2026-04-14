package ads.poo;

public class Carro {
    private String marca;
    public Motor propulsor;

    public Carro(String marca, Motor propulsor) {
        this.marca = marca;
        this.propulsor = propulsor;
    }

    public void acelerar(int v){
        this.propulsor.acelerar(v);
    }

    public void trocarMotor(Motor m){
        this.propulsor = m;
    }
}
