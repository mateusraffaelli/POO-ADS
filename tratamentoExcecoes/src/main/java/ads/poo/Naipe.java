package ads.poo;

public enum Naipe {
    OUROS(1, "ouros", "o"),
    ESPADAS(2, "espadas", "e"),
    COPAS(3, "copas", "c"),
    PAUS(4, "paus", "p");

    public final int valor;
    public final String extenso;
    public final String inicial;

    Naipe(int valor, String extenso, String inicial) {
        this.valor = valor;
        this.extenso = extenso;
        this.inicial = inicial;
    }
}
