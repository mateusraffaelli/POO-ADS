public class Argumentos {
    public static void main(String[] args) {

        if (args.length == 0) {

            IO.println("Não forneceu argumentos de linha de comando");

        }else{
            for (int i = 0; i < args.length; i++) {
                
                IO.println(i+1 + "º argumento: " + args[i]);
                
            }
        }
    }
}
