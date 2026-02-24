public class App {
    public static void main(String[] args) {
        // um vetor em Java é um objeto
        int[] vetor0 = new int[5]; // todas as posições começam com o valor 0

        vetor0[0] = 10;
        vetor0[4] = 90;

        int[][] matriz = new int[3][2]; 

        matriz[2][1] = 50;


        int[] numeros = {10, 20, 30};
        // Usando for tradicional
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        // Usando for−each
        for(int valor : numeros){
            System.out.println(valor);
        }

        int[][] matriz2 = {
            {1,2,3},
            {4,5,6}
        };
        
        // Usando for tradicional
        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++){
            System.out.println(matriz[i][j]);
            }
        }

        // Usando for−each
        for(int[] linha : matriz){
            for(int valor : linha){
                System.out.println(valor);
            }
        }

        int i = -10;
        int j = Math.abs(i);


    }
}