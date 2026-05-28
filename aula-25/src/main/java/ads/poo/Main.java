package ads.poo;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        DiaDaSemana primeiro;
        int dia;
        Disciplina poo;

        System.out.println("Digite a sigla:");
        String sigla = scanner.next();



        do {
            System.out.println("Digite o dia da semana:");
            dia = scanner.nextInt();
            primeiro = DiaDaSemana.getByCodigo(dia);
        }while (dia!= 1);

        poo = new Disciplina(sigla, new DiaDaSemana[]{primeiro});

        System.out.println(poo);






    }
}
