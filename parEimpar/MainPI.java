package parEimpar;

import java.util.Scanner;

public class MainPI {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        PI numeros = new PI();

        int opcao =0;

        do {
            System.out.println("\n---");
            System.out.println("1. Novo numero");
            System.out.println("2. Verifique se os numeros são par ou impar! ");
            System.out.println("3. Liste os numeros digitados");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                int n = lerInt("Insira o numero desejado: ");
                numeros.NovoNumero(n);
                break;

                case 2:
                numeros.VerificarPI();
                break;

                case 3:
                numeros.ListarNumeros();
                break;
            }

        } while (opcao !=0);


    }
    public static int lerInt(String msg) {
        System.out.println(msg);
        return scanner.nextInt();
    }
}
