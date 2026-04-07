package ads.poo;

public class ContaBancaria {
    private int numeroDaConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroDaConta, String titular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = saldo > 0? saldo : 0;
    }

    public void sacar(double valor){
        saldo -= valor > saldo? saldo : valor;
    }

    public void depositar(double valor){
        saldo += valor > 0? valor : 0;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    @Override
    public String toString() {
        return  "Numero Da Conta = " + numeroDaConta +
                "\nTitular= " + titular + '\'' +
                "\nSaldo= " + saldo +
                '}';
    }
}