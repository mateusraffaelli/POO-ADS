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

        // Caneta
        Caneta bic = new Caneta();
        bic.setCor("Azul");
        bic.setNivelTinta(0.01);
        System.out.println("\nCor: " + bic.getCor() + "\nNivel de tinta: " + bic.getNivelTinta());
        System.out.println(bic.desenhar(2,1,4,1));
        bic.abrirFecharCaneta();
        System.out.println(bic.desenhar(2,1,4,1));


    }
}