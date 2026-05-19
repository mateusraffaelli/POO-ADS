package ads.poo;

public class Aldeao extends Personagem implements Guerreiro{

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
}
