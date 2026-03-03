package ads.poo;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        int numeroAleatorio = r.nextInt(100) + 1; // 1 até 100
        int tentativas = 1;
        System.out.println(numeroAleatorio);
        int chute;

        do {
            IO.println("Digite um número:");
            chute = scanner.nextInt();

            if (chute == numeroAleatorio){
                IO.println("Muito bem! Você acertou o número aleatório com " + tentativas + " tentativas.");
            }else{
                tentativas++;
                String mensagem = chute > numeroAleatorio? "MAIOR":"MENOR";
                IO.println("Tente novamente! Seu número é " + mensagem + " que o número aleatório");

            }
        }while (chute != numeroAleatorio);


        scanner.close();
    }
}