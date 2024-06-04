package livraria;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Remover Livro");
            System.out.println("3. Listar Livros");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    adicionarLivro(biblioteca);
                    break;
                case 2:
                    removerLivro(biblioteca);
                    break;
                case 3:
                    biblioteca.listarLivros();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    public static void adicionarLivro(Biblioteca biblioteca) {
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();
        System.out.print("Digite o ano de publicação: ");
        int anoPublicacao = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha

        Livro livro = new Livro(titulo, autor, anoPublicacao);
        biblioteca.adicionarLivro(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    public static void removerLivro(Biblioteca biblioteca) {
        System.out.print("Digite o título do livro a ser removido: ");
        String titulo = scanner.nextLine();
        biblioteca.removerLivro(titulo);
        System.out.println("Livro removido com sucesso!");
    }
}

