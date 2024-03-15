package aulas_2_semestre;

import java.util.*;


class App {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int op = 0;
        double n1 = 0, n2 = 0, resp = 0;

        do {
            op = apresentarMenu();

            if (op == 0)
                break;

            n1 = pedirNumero("Me informa o primeiro número:");
            n2 = pedirNumero("Manda aí o segundo número:");

            if (op == 1)
                resp = somar(n1, n2);
            else if (op == 2)
                resp = n1 - n2;
            else if (op == 3)
                resp = n1 * n2;
            else if (op == 4)
                resp = n1 / n2;

            escrever("== " + resp);

        } while (op != 0);
    }
    



    public static int apresentarMenu()
    {
        System.out.println("\n\nEscolha uma operacao:");
        System.out.println("1. Adicao");
        System.out.println("2. Subtracao");
        System.out.println("3. Multiplicacao");
        System.out.println("4. Divisao");
        System.out.println("0. Sair");
        int opcao = ler.nextInt();

        return opcao;
    }


    public static double pedirNumero(String msg) {
        System.out.print("\n>> ");
        double num = ler.nextDouble();

        return num;
    }




    public static double somar(double a, double b) {
        double r = a + b;
        return r;
    }

    public static double subtrair(double a, double b) {
        double r = a - b;
        return r;
    }

    public static double multiplicar(double a, double b) {
        double r = a * b;
        return r;
    }

    public static double divisao(double a, double b) {
        double r = a / b;
        return r;
    }



    public static void escrever(String msg) {
        System.out.println(msg);
    }


}