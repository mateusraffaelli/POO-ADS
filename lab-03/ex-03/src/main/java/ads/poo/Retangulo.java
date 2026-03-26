package ads.poo;

public class Retangulo {
    private int largura;
    private int altura;
    private String codificacaoCaracteres; // (ASCII ou UTF8)

    public Retangulo(){
        largura = 4;
        altura = 3;
        codificacaoCaracteres = "ASCII";
    }

    public Retangulo(int largura, int altura, String codificacaoCaracteres){
        if (largura==0 || altura == 0){
            this.largura = 4;
            this.altura = 3;
        }else {
            this.largura = largura;
            this.altura = altura;
        }
        if (!(codificacaoCaracteres.equals("ASCII") || codificacaoCaracteres.equals("UTF8"))){
            this.codificacaoCaracteres = "ASCII";
        }else {
            this.codificacaoCaracteres = codificacaoCaracteres;
        }
    }

    public int getLargura() {
        return largura;
    }

    public boolean setLargura(int largura) {
        if (largura > 0 ){
            this.largura = largura;
            return true;
        }else{
            return false;
        }
    }

    public int getAltura() {
        return altura;
    }

    public boolean setAltura(int altura) {
        if (altura > 0 ){
            this.altura = altura;
            return true;
        }else{
            return false;
        }
    }

    public String getCodificacaoCaracteres() {
        return codificacaoCaracteres;
    }

    public boolean setCodificacaoCaracteres(String codificacaoCaracteres) {
        if (!(codificacaoCaracteres.equals("ASCII") || codificacaoCaracteres.equals("UTF8")) ){
            this.codificacaoCaracteres = codificacaoCaracteres;
            return true;
        }else{
            return false;
        }
    }

    public double calcularArea(){
        return largura*altura;
    }

    public double calcularPerimetro(){
        return 2*(largura+altura);
    }

    @Override
    public String toString() {
        if (codificacaoCaracteres.equals("ASCII")){
            String linhaTopo = "+" + "-".repeat(largura-2) + "+\n";
            String miolo = "|" + " ".repeat(largura-2) + "|\n";
            return linhaTopo + miolo.repeat(altura-2) + linhaTopo;
        }else{
            String linhaTopo = "\u250c" + "\u2500".repeat(largura-2) + "\u2510\n";
            String miolo = "\u2502" + " ".repeat(largura-2) + "\u2502\n";
            String linhaBaixo = "\u2514" + "\u2500".repeat(largura-2) + "\u2518\n";
            return  linhaTopo + miolo.repeat(altura-2) + linhaBaixo;
        }

    }
}
