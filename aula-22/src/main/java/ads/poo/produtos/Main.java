package ads.poo.produtos;

public class Main {
    static void main(String[] args) {
        Telefone telefone = new Telefone(1, 123, "Motorola", 22.5, new Dimensao());
        SemFio telSemFio = new SemFio(2, 321, "Nokia", 10.5, new Dimensao(), 12.5, 11, 30);

        System.out.println(telefone);
        System.out.println(telSemFio);

    }
}
