package ads.poo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    private ArrayList<ContaBancaria> contas;

    public App(){
        this.contas = new ArrayList<>();
    }

    void menu(int opcao){
        switch (opcao){
            case 1 -> {cadastrar();}
            case 2 -> {listarContas();}
            case 3 -> {depositar();}
            case 4 -> {sacar();}
            default -> IO.println("Número inválido\n");
        }
    }

    void cadastrar(){
        Random random = new Random();
        int numero = random.nextInt(1000);

        IO.println("\nNome titular: ");
        String titular = scanner.next();

        IO.println("\nSaldo inicial: ");
        double saldo = scanner.nextDouble();

        IO.println("\nNumero da conta: " + numero);


        ContaBancaria novaConta = new ContaBancaria(numero, titular, saldo);

        this.contas.add(novaConta);

    }

    void listarContas(){
        for (ContaBancaria elemento : contas){
            IO.println(elemento.toString());
        }
    }

    void depositar(){
        IO.println("\n..:: DEPÓsito ::.." +
                "\nDigite o número da conta: ");
        int numeroConta = scanner.nextInt();

        for(ContaBancaria elemento : contas ){
            if (elemento.getNumeroDaConta() == numeroConta){
                IO.println("\nDigite o valor: ");
                double deposito = scanner.nextDouble();
                elemento.depositar(deposito);
            }
        }
    }

    void sacar(){
        IO.println("\n..:: SAQUE ::.." +
                "\nDigite o número da conta: ");
        int numeroConta = scanner.nextInt();

        for(ContaBancaria elemento : contas ){
            if (elemento.getNumeroDaConta() == numeroConta){
                IO.println("\nDigite o valor: ");
                double saque = scanner.nextDouble();
                elemento.sacar(saque);
            }
        }
    }


    static void main(String[] args) {
        App app = new App();

        int opcao;

        do {
            IO.println(" ..:: Menu ::..\n" +
                    " 1 - Cadastrar conta\n" +
                    " 2 - Listar todas contas\n" +
                    " 3 - Depositar em uma conta\n" +
                    " 4 - Sacar de uma conta\n" +
                    " 5 - Sair\n" +
                    "Digite uma opção: ");
            opcao = scanner.nextInt();
            app.menu(opcao);
        }while (opcao != 5 );
    }
}