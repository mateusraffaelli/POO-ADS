package ads.poo;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Juca");
        lista.add("Maria");
        lista.add("Pedro");

        System.out.println(lista.get(0) + " " + lista.get(1) + " " + lista.get(2));

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals("Maria")){
                System.out.println();
            }
        }

        for (String elemento : lista){
            if (elemento.equals("Maria")){
                IO.println(elemento);
            }
        }

        // Usando expressões lambda ->
        lista.forEach(elemento -> {
            if (elemento.equals("Maria")) {
                IO.println(elemento);
            }
        });

        // Method reference - passar um método por referência, com o operador ::
        lista.forEach(IO::println); // Não precisa passar o parâmetro, ele já entende que será um único parâmetro



        // Remover todas String "Maria"
        lista.removeIf(elemento -> elemento.equals("Maria")); // removeIF já faz a lógica de remover e arrumar a posição da lista
    }
}
