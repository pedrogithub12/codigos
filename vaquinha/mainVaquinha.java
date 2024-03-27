package vaquinha;

import java.util.Scanner;

public class mainVaquinha {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        Vaquinha vaq = new Vaquinha();

        System.out.println("Olá, qual o seu objetivo para esta ação? ");
        vaq.objetivo = scanner.nextLine();

        System.out.println("Insira o valor da meta desejada: ");
        vaq.meta = scanner.nextDouble();
        
        int opcao =0;

       do {
        
        System.out.println("\nMENU");
        System.out.println("1. Doar");
        System.out.println("2. Analiar");
        System.out.println("0. Sair");
        opcao = scanner.nextInt();

        switch(opcao) {
            case 1:
            System.out.println("Valor da doação: ");
            double v = scanner.nextDouble();

            vaq.doar(v);
            break;

            case 2:
            vaq.analiar();
            break;
        }

      } while (opcao != 0);

    }
}