package ads.poo;

public class Caneta {

    private String cor;
    private double nivelTinta;
    private boolean aberta;

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public double getNivelTinta(){
        return nivelTinta;
    }

    public void setNivelTinta(double nivelTinta){
        this.nivelTinta = nivelTinta;
    }

    public boolean isAberta(){
        return aberta;
    }

    public void abrirFecharCaneta(){
        aberta =! aberta;
    }

    public String desenhar(int x1, int y1, int x2, int y2){
        if (aberta){
            double distancia = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2, 2));
            double consumoDeTinta = distancia * 0.01;

            if (nivelTinta >= consumoDeTinta){
                nivelTinta -= consumoDeTinta;
                return String.format("Desenhei %.2fcm na cor %s" , distancia, cor);
            }else{
                return "Nivel de tinta insuficiente";
            }
        }else{
            return "A caneta está fechada";
        }
    }





}
