package ads.poo;

public class Pessoa {
    private String nome;
    private String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa" +
                "\nNome: " + nome +
                "\nEmail: " + email ;
    }
}
