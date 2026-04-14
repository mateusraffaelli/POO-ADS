package ads.poo;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private Pessoa autor;
    private ArrayList<Capitulo> capitulos;

    public Livro(String titulo, Pessoa autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.capitulos = new ArrayList<>();
    }

    public void adicionaCapitulo(String t){
        Capitulo novoCapitulo = new Capitulo(t);
        capitulos.add(novoCapitulo);
    }

    @Override
    public String toString() {
        return "Livro" +
                "\nTitulo: " + titulo +
                "\nAutor: " + autor +
                "\nCapitulos: " + capitulos;
    }
}
