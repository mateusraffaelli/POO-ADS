package ads.poo;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        Aldeao aldeao = new Aldeao();
        Arqueiro arqueiro = new Arqueiro();
        Cavaleiro cavaleiro = new Cavaleiro();

        ArrayList<Personagem> personagens = new ArrayList<>();
        personagens.add(aldeao);
        personagens.add(arqueiro);
        personagens.add(cavaleiro);

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
