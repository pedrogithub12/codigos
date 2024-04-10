package temperaturas;

import java.util.Scanner;

public class MainTemperatura {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        Temperatura temp = new Temperatura();

        int opcao =0;
        do {
            System.out.println("\n---");
            System.out.println("1. Nova Temperatura");
            System.out.println("2. Calculo");
            System.out.println("3. Exibir");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                double t = lerDouble("Digite a temperatura");
                temp.pedirTemperatura(t);
                break;

                case 2:
                double conv = temp.calculo();
                System.out.println("A média das temperaturas é: " + conv);
                break;

           
              
        
            }

        } while (opcao != 0);

    }
    
    public static double lerDouble(String msg) {
        System.out.println(msg);
        return scanner.nextDouble();
        
    }
}
