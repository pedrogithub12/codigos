package contacorrente;

import java.util.Scanner;

public class mainCC {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Conta:");
        double conta = scanner.nextInt();

        // ContaCorrente cc = new ContaCorrente();

        int menu = 0;
        do {

            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Ver Saldo");
            System.out.println("0. Sair");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Valor do depósito: ");
                    double d = scanner.nextDouble();

                    // ????
                    break;

                case 2:
                    System.out.println("Valor do saque: ");
                    double d = scanner.nextDouble();

                    // ????
                    break;

                case 3:
                    // ????
                    break;
            }

        } while (menu != 0);

    
    }
}
