package ads.poo;

public class Main {
    static void main(String[] args) {

        // Criando um objeto
        Lampada a = new Lampada();

        // Criando outro objeto da classe Lampada
        Lampada b = new Lampada();

        a.ligarDesligar();

        System.out.println(a.isLigada());
        System.out.println(b.isLigada());
    }
}