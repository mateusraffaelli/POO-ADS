package ads.poo;

public class Personagem {
    private int forca;
    private int vigor;
    private int defesa;
    private int destreza;
    private int inteligencia;

    public void setForca(int forca){
        this.forca = forca;
    }

    public void setDefesa(int defesa){
        this.defesa = defesa;
    }

    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public boolean atacar(int defesaInimigo){
        if (forca > defesaInimigo){
            return true;
        }else{
            return false;
        }
    }

    public boolean defender(int ataqueInimigo){
        if (defesa > ataqueInimigo){
            return true;
        }else{
            return false;
        }
    }

    public boolean lancarMagia(int defesaInimigo ){
        if (inteligencia > defesaInimigo){
            return true;
        }else {
            return false;
        }
    }


}
