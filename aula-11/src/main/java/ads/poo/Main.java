package ads.poo;

public class Main{

    static void main(String[] args) {
        Carro carro = new Carro("Fusca", 200);
        carro.acelerar(20);
        System.out.println(carro.getVelocidadeAtual());
        System.out.println(carro.getVelociidadeMaxima());

        Carro carro1 = new Carro("Gol");




        Pessoa pessoa = new Pessoa("Juca","122.323.558-90","juca.silva@emial.com");

//        pessoa.setNome("Juca");
//        pessoa.setCpf("122.323.558-90");
//        pessoa.setEmail("juca.silva@emial.com");

        System.out.println(pessoa.toString()); // == System.out.println(pessoa)


    }
}
