public class App3 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int contador = 1;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = contador ++;
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
