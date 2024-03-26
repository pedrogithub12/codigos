package pessoa;

import java.util.Scanner;

public class mainpessoa {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
       
        System.out.println("Peso: ");
        p.peso = scanner.nextDouble();

        System.out.println("Altura: ");
        p.altura = scanner.nextDouble();

        double imc = p.imc();

        System.out.println("IMC: "+ imc);
       
    }
}
