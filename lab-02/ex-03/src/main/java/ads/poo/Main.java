package ads.poo;

public class Main {
    static void main(String[] args) {

        if (args[0].equals("triangulo") && args.length == 2) {
            int colunas = Integer.parseInt(args[1]);
            String mensagem = "*";
            for (int i = 0; i < colunas; i++) {
                IO.println(mensagem);
                mensagem = mensagem + "*";
            }
        }else if (args[0].equals("losango") && args.length == 2){
            if (Integer.parseInt(args[1]) % 2 != 0){
                IO.println("O argumento do losango precisa ser um número ímpar");
            }
            int colunas = Integer.parseInt(args[1]);
            String mensagem = "*";
            for (int i = 0; i < colunas; i++) {
                IO.println(mensagem);
                mensagem = mensagem + "*";
            }
        }else if (args[0].equals("retangulo")&& args.length == 3){

        }else{
            IO.println("Argumentos inválidos");
        }
    }
}
