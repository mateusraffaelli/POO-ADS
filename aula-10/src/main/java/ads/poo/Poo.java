package ads.poo;

public class Poo {
    private boolean logica;
    private boolean java;

    public void setLogica(boolean logica){
        this.logica = logica;
    }

    public void setJava(boolean java){
        this.java = java;
    }

    public boolean programar(){
        if (logica && java){
            return true;
        }else{
            return false;
        }
    }
}
