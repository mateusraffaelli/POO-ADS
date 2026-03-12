package ads.poo;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        // Contador
        Contador contador = new Contador();
        contador.atribuirValor(10);
        contador.incrementarEmUm();
        IO.println(contador.getValorAtual());
        System.out.println();

        // Personagem
        Personagem personagem = new Personagem();
        System.out.println("Escolha sua classe de personagem: " +
                "\n [1] CAVALEIRO " +
                "\n [2] LADRÃO" +
                "\n [3] GUERREIRO" +
                "\n [4] FEITICEIRO" );
        int escolha = scanner.nextInt();
        switch (escolha){
            case 1:
                personagem.setVigor(12);
                personagem.setForca(15);
                personagem.setDestreza(10);
                personagem.setInteligencia(5);
            break;
            case 2:
                personagem.setVigor(10);
                personagem.setForca(12);
                personagem.setDestreza(15);
                personagem.setInteligencia(8);
            break;
            case 3:
                personagem.setVigor(10);
                personagem.setForca(12);
                personagem.setDestreza(12);
                personagem.setInteligencia(5);
            break;
            case 4:
                personagem.setVigor(12);
                personagem.setForca(8);
                personagem.setDestreza(10);
                personagem.setInteligencia(15);
            break;
        }

        System.out.println("Um inimigo apareceu na sua frente! " +
                "\nSUA VEZ DE ATACAR:" +
                "\n[1] USAR ESPADA " +
                "\n[2] USAR ARCO" +
                "\n[3] LANÇAR MÁGIA" );

        System.out.println(
                "\nSUA VEZ DE DEFENDER: " +
                "\n[1] USAR ESCUDO " +
                "\n[2] DESVIAR DO ATAQUE" +
                "\n[3] USAR ESCUDO MÁGICO" );



        if (personagem.atacar(5)){
            System.out.println("Ataque realizado com sucesso");
        }else{
            System.out.println("Ataque muito fraco");
        }

        if (personagem.defender(10)){
            System.out.println("Defesa realizada com sucesso");
        }else{
            System.out.println("Defesa não efetiva");
        }

        if (personagem.lancarMagia(5)){
            System.out.println("Ataque realizado com sucesso");
        }else{
            System.out.println("Ataque muito fraco");
        }




        System.out.println();

        // Batedeira
        Batedeira batedeira = new Batedeira();
        batedeira.setPotencia(10);
        batedeira.setVelocidade(20);
        IO.println("Tempo para bater: " + batedeira.tempoParaBater(20));
        System.out.println();

        // Poo
        Poo poo = new Poo();
        poo.setLogica(true);
        poo.setJava(true);
        if (poo.programar()){
            System.out.println("Você consegue programar");
        }else {
            System.out.println("Você não consegue programar");
        }
        System.out.println();
    }
}
