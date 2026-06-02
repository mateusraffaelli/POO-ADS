package ads.poo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    static void main() {
        Caixa<String> c = new Caixa<>("Olá Mundo");
        Caixa<Pessoa> d = new Caixa<>(new Pessoa("João"));

        // não precisa de typecasting
        String s = c.getConteudo();

        // erro de compilação, tipos incompátiveis
        // String errado = d.getConteudo();

        Pessoa p = d.getConteudo();

        IO.println(s);
        IO.println(p);


        ArrayList<String> a = new ArrayList<>();
        HashMap<String, String> b = new HashMap<>();

    }
}
