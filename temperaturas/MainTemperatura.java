package temperaturas;

import java.util.Scanner;

public class MainTemperatura {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        MainTemperatura temp = new MainTemperatura();

        int opcao =0;
        do {
            System.out.println("\n---");
            System.out.println("1. Nova Temperatura");
            System.out.println("2. Calculo");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                double t = lerDouble("Digite a temperatura");
                temp.pedirTemperatura(t);
                break;
            }

        } while (opcao != 0);
    }
    public static double lerDouble(String msg) {
        System.out.println(msg);
        return scanner.nextDouble();
    }
}
