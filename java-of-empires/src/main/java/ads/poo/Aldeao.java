package ads.poo;

public class Aldeao extends Personagem implements Guerreiro, Coletor{

    public Aldeao() {
        super( 25,  1,  0.8);
    }

    @Override
    public String mover() {
        return "Aldeao correndo";
    }

    @Override
    public String atacar() {
        return "Aldeao atacando com a enxada";
    }

    @Override
    public String toString() {
        return "ALDEÃO" + super.toString();
    }

    @Override
    public String coletarMadeira() {
        return "Coletando madeira com o machado";
    }

    @Override
    public String coletarOuro() {
        return "Colotando ouro com a picareta";
    }
}
