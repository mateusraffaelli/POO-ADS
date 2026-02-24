public class App2 {
public static void main(String[] args) {
    int[] vetor = new int[100];
    vetor[0] = 3;
    
        for (int i = 1; i < vetor.length; i++) {
            vetor[i] = vetor[i-1] + 2;
            System.out.println(vetor[i]);
        }
    }
}
