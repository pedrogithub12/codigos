package livraria;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(String titulo) {
        livros.removeIf(livro -> livro.getTitulo().equalsIgnoreCase(titulo));
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }
}
