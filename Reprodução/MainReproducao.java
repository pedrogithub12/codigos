package Reprodução;

import java.util.Scanner;

public class MainReproducao {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        ListaReproducao reproducao = new ListaReproducao();

        int opcao =0;
        do {
            
            System.out.println("\nMENU");
            System.out.println("\n O que você deseja? ");
            System.out.println("1. Adicionar Musica");
            System.out.println("2. Tocar Proxima");
            System.out.println("3. Listar Musicas");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();


            switch(opcao){

                case 1:
                System.out.println("Digite o nome do artista: ");
                String nomeMusica = scanner.nextLine();
                scanner.next();

                


                Musica musica = new Musica();
                musica.nome = nomeMusica;


                reproducao.adicionar(null);
                break;

            }
        } while (opcao !=0);

    }
    
}