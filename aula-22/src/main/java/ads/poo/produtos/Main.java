package ads.poo.produtos;

public class Main {
    static void main(String[] args) {
        Telefone telefone = new Telefone(1, 123, "Motorola", 22.5, new Dimensao());
        SemFio telSemFio = new SemFio(2, 321, "Nokia", 10.5, new Dimensao(), 12.5, 11, 30);


        Telefone a = new SemFio(3, 132, "Samsung", 13.5, new Dimensao(), 11, 10, 31);

        // telSemFio.getFrequencia();

        System.out.println(telefone);
        System.out.println(telSemFio);
        System.out.println(((SemFio)a).getFrequencia());




        Telefone[] vetor = new Telefone[3];
        vetor[0] = telefone;
        vetor[1] = telSemFio;
        vetor[2] = a;

        for (Telefone aux : vetor){
            if (aux instanceof  SemFio novo){
                System.out.println(novo.getFrequencia());
            }

        }

    }
}
