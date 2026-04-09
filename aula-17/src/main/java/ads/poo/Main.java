package ads.poo;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    static void main() {
        // HASHMAP
        // chave unica - só trabalha com Objetos

        ArrayList<Conta> lista = new ArrayList<>();
        // <Tipo da chave, Tipo do valor>
        HashMap<Integer, Conta> mapa = new HashMap<>();

        Conta t = mapa.put(123, new Conta(123, "Juca", 10));
        Conta s = mapa.put(123, new Conta(123, "Juca", 10));

        if (!mapa.containsKey(123)){ // Se não existir ninguém com essa chave
            mapa.put(123, new Conta(123, "Juca", 10));
        }


        for (Conta c : lista){
            if (c.getNumeroDaConta() == 123){
                IO.println(c);
            }
        }

        lista.forEach(e-> {
            if (e.getNumeroDaConta() == 123){
                IO.println(e);
            }
        });
    }
}
