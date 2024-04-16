package soma;

import java.util.Scanner;

public class MainSoma {
    public static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            
            Soma calc = new Soma();
            int opcao =0;

            do {
                System.out.println("\n---");
                System.out.println("1. Novo calculo");
                System.out.println("2. Soma");
                System.out.println("3. Multiplicação");
                System.out.println("4. Exibir Calculos");
                System.out.println("0. Sair");
                opcao = scanner.nextInt();

                switch(opcao){
                    case 1:
                    double r = lerDouble("Digite o calculo desejado: ");
                    calc.inserirNumeros(r);
                    break;

                    case 2:
                    double rSoma = calc.calculo();
                    System.out.println("O resultado da soma é: " + rSoma);
                    break;

                    case 3:
                    double rMultiplicação = calc.Multiplicação();
                    System.out.println("O resultado da multiplicação é: " + rMultiplicação);
                    break;

                    case 4:
                    calc.exibirResultados();
                    break;
                }

            } while (opcao != 0);

        }
        public static double lerDouble(String msg) {
            System.out.println(msg);
            return scanner.nextDouble();
        }
}
