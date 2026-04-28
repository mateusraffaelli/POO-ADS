package ads.poo;

import java.time.LocalDate;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ColecaoTelefone telefones;
    private ColecaoEmail emails;

    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
    }

    public boolean addTelefone(String rotulo, String valor){
        return telefones.add(rotulo,valor);
    }

    public boolean addEmail(String rotulo, String valor){
        return emails.add(rotulo,valor);
    }

    public boolean removeTelefone(String rotulo){
        return telefones.remove(rotulo);
    }

    public boolean removeEmail(String rotulo){
        return emails.remove(rotulo);
    }

    public boolean updateTelefone(String rotulo, String valor){
        return telefones.add(rotulo,valor);
    }

    public boolean updateEmail(String rotulo, String valor){
        return emails.add(rotulo,valor);
    }

    @Override
    public String toString() {
        return "Contato: " +
                "\nNome: " + nome +
                "\nSobrenome: " + sobrenome +
                "\nData de Nascimento: " + dataNasc +
                "\nTelefones: " + telefones +
                "\nEmails: " + emails;
    }
}
