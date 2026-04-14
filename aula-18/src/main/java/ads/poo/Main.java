package ads.poo;

public class Main {
    static void main() {

        // Agregação
        Motor simples = new Motor();

        Carro fusca = new Carro("VW", simples);
        fusca = null;

        Motor prof = new Motor();
        Carro ferrari = new Carro("ferrari", simples);

        ferrari.trocarMotor(prof);



        // Composição
        Livro livro = new Livro("a", new Pessoa("Mateus", "123"));

        livro.adicionaCapitulo("Introdução");
        livro.adicionaCapitulo("Andamento");
        livro.adicionaCapitulo("Conclusões");

        IO.println(livro);
    }
}
