package GerenciarLivros;

import java.util.Scanner;

public class MainLivros {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Livros gerenciador = new Livros();

        int opcao =0;

        do {
            System.out.println("\n---");
            System.out.println("1. Novo Livro");
            System.out.println("2. Verifique se os numeros são par ou impar! ");
            System.out.println("3. Liste os numeros digitados");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira o nome do autor: ");
                    String autor = scanner.nextLine();
                    System.out.println("Insira o Titulo do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Insira o ano de publicação: ");
                    int anoPublicacao = scanner.nextInt();
                    scanner.nextLine();

                    gerenciador.NovoLivro(null);
                    break;
            }


        } while (opcao !=0);
    }
}
