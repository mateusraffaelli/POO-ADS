package ads.poo.produtos;

public class SemFio extends Telefone{
    private double frequencia;
    private int canais;
    private double distanciaOperacao;

    public SemFio(int codigo, int numeroSerie, String modelo, double peso, Dimensao dimensao, double frequencia, int canais, double distanciaOperacao) {
        super(codigo, numeroSerie, modelo, peso, dimensao);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distanciaOperacao = distanciaOperacao;
    }

    @Override
    public String toString() {
        return super.toString() + " SemFio {" +
                "frequencia=" + frequencia +
                ", canais=" + canais +
                ", distanciaOperacao=" + distanciaOperacao +
                '}';
    }

    public double getFrequencia(){
        return this.frequencia;
    }
}
