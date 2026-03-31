package ads.poo;

public class Robo {
    private String nome;
    private final int numeroDeSerie;
    private static int contador = 0;

    public Robo(String nome){
        contador ++;
        this.numeroDeSerie = contador;
        this.nome = nome;
    }

    public static int getQuantidadeRobos() {
        return contador;
    }

    public String getNome(){
        return nome;
    }

    public int getNumeroDeSerie(){
        return numeroDeSerie;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("Robô: %s | Série: %s | Total de robôs: %d",
                nome, numeroDeSerie, contador);
    }
}
