package ads.poo;

import java.util.Scanner;

public class EstacaoDoAno {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        IO.println("Entre com o dia: ");
        int data = scanner.nextInt();
        IO.println("Entre com o mês: ");
        scanner.nextLine();
        String mes = scanner.nextLine();
        String estacao = "";

        if (mes.equalsIgnoreCase("Dezembro") ||  mes.equalsIgnoreCase("Janeiro") || mes.equalsIgnoreCase("Fevereiro") || mes.equalsIgnoreCase("Março")){
            if(!((data==20 && mes.equalsIgnoreCase("Dezembro")) || (data==21 && mes.equalsIgnoreCase("Março")))){
                IO.println(estacao = "Verão");
            }
        }if (mes.equalsIgnoreCase("Março") ||  mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Maio") || mes.equalsIgnoreCase("Junho")){
            if(!((data==20 && mes.equalsIgnoreCase("Março")) || (data==21 && mes.equalsIgnoreCase("Junho")))){
                IO.println(estacao = "Outono");
            }
        }if (mes.equalsIgnoreCase("Julho") ||  mes.equalsIgnoreCase("Agosto") || mes.equalsIgnoreCase("Setembro")){
            if(!((data==20 && mes.equalsIgnoreCase("Julho")) || (data==21 && mes.equalsIgnoreCase("Setembro")))){
                IO.println(estacao = "Inverno");
            }
        }if (mes.equalsIgnoreCase("Outubro") ||  mes.equalsIgnoreCase("Novembro") || mes.equalsIgnoreCase("Dezembro")){
            if(!((data==20 && mes.equalsIgnoreCase("Outubro")) || (data==21 && mes.equalsIgnoreCase("Dezembro")))){
                IO.println(estacao = "Primavera");
            }
        }

        IO.println("# Saída: " + estacao);


        scanner.close();
    }
}
