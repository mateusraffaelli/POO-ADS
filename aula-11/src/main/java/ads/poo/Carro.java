package ads.poo;

public class Carro {
    private String modelo;
    private int velocidadeAtual;
    private int velociidadeMaxima;

    public static final int VEL_MAX_MODELOS = 300;
    public static final int VEL_MIN = 0;

    public Carro(String modelo, int velociidadeMaxima){
        this.modelo = modelo;
        this.velociidadeMaxima = (velociidadeMaxima> VEL_MAX_MODELOS)? VEL_MAX_MODELOS : velociidadeMaxima;
    }

    public Carro (String modelo){
        this.modelo = modelo;
    }


    public void acelerar(int valor){
        velocidadeAtual = (velocidadeAtual + valor > velociidadeMaxima) ? velociidadeMaxima : velocidadeAtual+valor;

//        if (valor + velocidadeAtual > velociidadeMaxima){
//            velocidadeAtual = velociidadeMaxima;
//        }else {
//            velocidadeAtual += valor;
//        }
    }

    public void freiar(int valor){
        velocidadeAtual = (valor > velocidadeAtual) ? VEL_MIN : velocidadeAtual - valor ;



//        if (valor > velocidadeAtual) {
//            velocidadeAtual = 0;
//        }else{
//            velocidadeAtual -= valor;
//        }
    }

    public int getVelocidadeAtual(){
        return velocidadeAtual;
    }

    public String getModelo(){
        return modelo;
    }

    public int getVelociidadeMaxima(){
        return velociidadeMaxima;
    }
}
