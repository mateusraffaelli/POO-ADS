package ads.poo;

import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    private HashMap<String ,Livro> mapa = new HashMap<>();

    public App(){
        this.mapa = new HashMap<>();

        Livro livro1 = new Livro("10", "Brás Cubas", "Machado de Assis", 1881);
        Livro livro2 = new Livro("41", "Diário de um Banana", "Jeff Kinney", 2007);
        Livro livro3 = new Livro("42", "Diário de um Banana", "Jeff Kinney", 2007);
        mapa.put("10", livro1);
        mapa.put("41", livro2);
        mapa.put("42",livro3);
    }

    void menu(int opcao){
        switch (opcao){
            case 1 -> {cadastrar();}
            case 2 -> {listarLivros();}
            case 3 -> {listarLivrosAno();}
            case 4 -> {alterarDados();}
            default -> IO.println("Número inválido\n");
        }
    }

    void cadastrar(){
        String codigo = IO.readln("Digite o Código do livro: ");
        String titulo = IO.readln("Digite o Título: ");
        String autor = IO.readln("Digite o Autor: ");
        IO.println("Digite o ano: ");
        int ano = scanner.nextInt();

        mapa.put(codigo, new Livro(codigo, titulo, autor, ano ));
    }

    void listarLivros(){
        mapa.forEach((isbn, livro) -> {
            System.out.println(livro);
        });
    }

    void listarLivrosAno(){
        IO.println("Digite o ano que você deseja buscar: ");
        int anoBuscado = scanner.nextInt();

        for (Livro livro : mapa.values()){
            if (livro.getAno() == anoBuscado){
                System.out.println(livro);
            }
        }
    }

    void alterarDados(){
        IO.println("Digite o ISBN do livro: ");
        String chave = scanner.next();

        if (mapa.containsKey(chave)){
            int opcao;
            do {
                IO.println("Digite o dado que você quer alterar:\n" +
                        " 1 - Título\n" +
                        " 2 - Autor\n" +
                        " 3 - Ano de lançamento\n" +
                        " 4 - Sair\n" +
                        "Digite uma opção: ");
                opcao = scanner.nextInt();

                IO.println("Digite o novo dado:");

                switch (opcao){
                    case 1 -> {
                        String novoTitulo = scanner.next();
                        mapa.get(chave).setTitulo(novoTitulo);
                    }
                    case 2 -> {
                        String novoAutor = scanner.next();
                        mapa.get(chave).setAutor(novoAutor);
                    }
                    case 3 -> {
                        int novoAno = scanner.nextInt();
                        mapa.get(chave).setAno(novoAno);
                    }
                    default -> IO.println("Número inválido\n");
                }
            }while (opcao != 4);



        }else {
            IO.println("Essa chave não existe");
        }
    }


    static void main() {
        App app = new App();

        int opcao;

        do {
            IO.println(" ..:: Menu ::..\n" +
                    " 1 - Cadastrar livro\n" +
                    " 2 - Listar todos os livros\n" +
                    " 3 - Listar todos os livros publicados em um ano específico\n" +
                    " 4 - Alterar dados de um livro\n" +
                    " 5 - Sair\n" +
                    "Digite uma opção: ");
            opcao = scanner.nextInt();
            app.menu(opcao);
        }while (opcao != 5 );
    }
}
