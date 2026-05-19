package ads.poo;

public class Main {
    static void main(String[] args) {
        Aldeao aldeao = new Aldeao();
        Arqueiro arqueiro = new Arqueiro();
        Cavaleiro cavaleiro = new Cavaleiro();

        Personagem[] personagens = new Personagem[3];
        personagens[0] = aldeao;
        personagens[1] = arqueiro;
        personagens[2] = cavaleiro;

        for (Personagem p : personagens){
            System.out.println(p);
            System.out.println(p.mover());
            if (p instanceof  Guerreiro g){
                System.out.println(g.atacar());
            }
            System.out.println();
        }



    }
}
