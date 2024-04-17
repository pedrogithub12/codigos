package ControleReserva;

import java.util.Scanner;

public class MainReservas {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Reserva reserva1 = new Reserva();
        ControleReserva cr = new ControleReserva();

        int opcao =0;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Nova Reserva");
            System.out.println("2. Chamar Proximo");
            System.out.println("3. listar Reservas");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();


            switch(opcao){

                case 1:

                System.out.println("\nDigite o responsável da reserva");

                reserva1.responsavel = scanner.next();
                scanner.nextLine();

                System.out.println("\nDigite o número de lugares");

                reserva1.lugares = scanner.nextInt();

                cr.novaReserva(reserva1);

                case 2:
                cr.proximo();

                case 3:
                cr.listar();
            }
        } while (opcao != 0);
    }
}
