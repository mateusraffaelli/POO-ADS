package ads.poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a,b;

        try{
            System.out.println("Entre com o número: ");
            a = ler.nextInt();
            System.out.println("Entre com o número");
            b = ler.nextInt();

            int res = a/b;

            System.out.println(a + " dividido por " + b + " = " + res);
        }catch (InputMismatchException e){
            System.err.println("Só é permitido números inteiros");
        }catch (ArithmeticException e){
            System.err.println("Não é permitido divisões por zero");
        }catch (Exception e){
            System.err.println("Ocorreu um erro inesperado");
        }finally {
            System.out.println("Fim do programa");
            ler.nextLine();
        }

    }
}
