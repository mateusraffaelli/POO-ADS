package ads.poo;

public class Arqueiro extends Personagem implements Guerreiro{
    public Arqueiro() {
        super(35, 2, 1);
    }

    @Override
    public String mover() {
        return "Arqueiro correndo";
    }

    @Override
    public String atacar() {
        return "Arqueiro atirando flexa";
    }

    @Override
    public String toString() {
        return "ARQUEIRO" + super.toString();
    }
}
