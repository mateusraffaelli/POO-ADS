package ads.poo.produtos;

public class Telefone {
    protected int codigo;
    protected int numeroSerie;
    protected String modelo;
    protected double peso;
    protected Dimensao dimensao;

    public Telefone(int codigo, int numeroSerie, String modelo, double peso, Dimensao dimensao) {
        this.codigo = codigo;
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dimensao = dimensao;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "codigo=" + codigo +
                ", numeroSerie=" + numeroSerie +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", dimensao=" + dimensao +
                '}';
    }

    public String getModelo(){
        return this.modelo;
    }
}
