package ads.poo;

public enum Planeta {
    MERCURIO(1),
    VENUS(2),
    TERRA(3),
    MARTE(4),
    JUPTER(5),
    SATURNO(6),
    URANO(7),
    NETUNO(8);

    public final int posicao;

    Planeta(int posicao) {
        this.posicao = posicao;
    }

    public static Planeta getByPosicao(int posicao){
        for (Planeta p : Planeta.values()){
            if (p.posicao == posicao){
                return p;
            }
        }
        throw new IllegalArgumentException("Posição Inválida");
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "posicao=" + posicao +
                '}';
    }
}
